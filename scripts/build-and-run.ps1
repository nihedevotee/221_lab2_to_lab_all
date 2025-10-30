Param(
    [string]$MainClass = ""
)

Write-Host "== Java / javac versions =="
try { java -version 2>&1 | Write-Host } catch { Write-Host "java not found in PATH" }
try { javac -version 2>&1 | Write-Host } catch { Write-Host "javac not found in PATH" }

if (-not (Get-Command javac -ErrorAction SilentlyContinue)) {
    Write-Host "ERROR: 'javac' not found in PATH. Ensure JDK 21 is installed and JAVA_HOME\bin is on PATH." -ForegroundColor Red
    exit 1
}

$scriptRoot = Split-Path -Parent $MyInvocation.MyCommand.Definition
$repoRoot = Resolve-Path (Join-Path $scriptRoot "..")
$srcDir = Join-Path $repoRoot "lab2"
$outDir = Join-Path $repoRoot "out"

if (-not (Test-Path $srcDir)) { Write-Host "Source folder $srcDir not found" ; exit 1 }
if (-not (Test-Path $outDir)) { New-Item -ItemType Directory -Path $outDir | Out-Null }

$javaFiles = Get-ChildItem -Path $srcDir -Filter *.java -Recurse | ForEach-Object { $_.FullName }
if ($javaFiles.Count -eq 0) { Write-Host "No .java files found in $srcDir" ; exit 1 }

Write-Host "Compiling $($javaFiles.Count) file(s) with --release 21 ..."
& javac --release 21 -d $outDir $javaFiles
if ($LASTEXITCODE -ne 0) { Write-Host "Compilation failed (javac returned $LASTEXITCODE)" -ForegroundColor Red ; exit $LASTEXITCODE }

if ($MainClass -eq "") {
    Write-Host "Compilation successful. To run a class, re-run the script with -MainClass <ClassName> (e.g. no1Alab2)"
    exit 0
}

Write-Host "Running $MainClass ..."
& java -cp $outDir $MainClass
