# Upgrade to Java 21 (manual steps)

This repository's automated Java upgrade tool is not available in this environment (requires a paid plan). The files in this repo appear to be plain `.java` files under `lab2/` (no Maven/Gradle build files found). The quickest safe path to use Java 21 is to install JDK 21 locally and compile/run with it.

Steps (Windows / PowerShell):

1. Install JDK 21
   - Download and install a Temurin/Adoptium or other JDK 21 distribution.
   - Note the installation path (example: `C:\Program Files\Java\jdk-21`).

2. Set `JAVA_HOME` and update your `Path` (PowerShell example):

```powershell
# Replace the path below with your JDK 21 install location
[Environment]::SetEnvironmentVariable('JAVA_HOME','C:\Program Files\Java\jdk-21','User')
$env:JAVA_HOME = 'C:\Program Files\Java\jdk-21'
[Environment]::SetEnvironmentVariable('Path', "$env:JAVA_HOME\bin;" + [Environment]::GetEnvironmentVariable('Path','User'),'User')
# Restart your shell after this change to pick up the new PATH
```

3. Verify Java 21 is active:

```powershell
java -version
javac -version
```

4. Compile and run the examples in `lab2/` (this repo includes several .java files). A helper script is included at `..\scripts\build-and-run.ps1` to compile with `--release 21` and run a specified main class.

Example usage:

```powershell
# Compile and run class `no1Alab2`
.\scripts\build-and-run.ps1 -MainClass no1Alab2
```

Notes:
- If you prefer a build system (Maven/Gradle), I can add a minimal `pom.xml` or `build.gradle` that sets Java 21 as the compilation target.
- If you'd like, I can also attempt to install JDK 21 automatically here, but the automated install tool may be unavailable in this environment; tell me if you want me to try.
