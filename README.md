[![](https://jitpack.io/v/PPaszkiewicz/JitPackTest.svg)](https://jitpack.io/#PPaszkiewicz/JitPackTest)

# Testing JitPack releases

Notes of progress:

### Release 0.0:
No 'maven' plugin in any module. 

    implementation("com.github.PPaszkiewicz:JitPackTest:0.0")

Allows usage of android library module (automatically picked up).

### Release 0.1:
'maven' plugin in **javaLib** module. 

    implementation("com.github.PPaszkiewicz:JitPackTest:0.1")

Allows usage of java module, android library no longer available.

##### Release 0.2:
'maven' plugin in both modules. No changes (android module not available).

##### Release 0.3:
'maven' plugin on top. No changes (android module not available).

### Release 0.4:
Using 'com.github.dcendents.android-maven' plugin. 

    implementation("com.github.PPaszkiewicz:JitPackTest:0.4")
    
Android module properly available. Can also import specific submodules:

    implementation("com.github.PPaszkiewicz.JitPackTest:javaLib:0.4")
    implementation("com.github.PPaszkiewicz.JitPackTest:androidktlib:0.4")
    
##### Release 0.5:
'maven-publish' plugin in android library instead. Broken as release **0.1**.

##### Release 0.6 - 0.8
Build failed, check logs on jitpack.

### Release 0.9
'maven-publish' with invalid config. Can include but jar is empty.

### Release 2.0
Finalized script in root `build.gradle` that publishes modules with their source included (to present docs).