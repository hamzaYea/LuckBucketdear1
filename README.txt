Luck Bucket — Fabric mod project for Minecraft Java Edition 26.1.2

This project is configured for Java 25 and Fabric. The GitHub Actions workflow builds the project and uploads the JAR as an artifact.

Build on GitHub:
1. Create an empty repository on your GitHub account.
2. Upload the contents of this folder to the repository (the files inside luckbucket/, not the outer folder).
3. Open the repository's Actions tab and select “Build Luck Bucket Fabric Mod”.
4. Click “Run workflow” if it did not run automatically after the upload.
5. Open the completed workflow run and download the artifact named luckbucket-minecraft-26.1.2-fabric.
6. Extract the downloaded artifact ZIP and put the mod .jar in your Minecraft instance's mods folder.

Important:
- The source currently implements a client-side bucket right-click handler that sends a /give command for a Luck potion.
- That command requires cheats enabled in single-player or operator permissions on a server.
- This is a source project, not a compiled JAR. GitHub Actions must successfully build it before a JAR is available.
