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

### Release 0.2:
'maven' plugin in both modules. 

    implementation("com.github.PPaszkiewicz:JitPackTest:0.2")
    
No changes (android module not available)

### Release 0.3:
'maven' plugin on top. 

    implementation("com.github.PPaszkiewicz:JitPackTest:0.3")
    
No changes (android module not available)

### Release 0.4:
Using 'com.github.dcendents.android-maven' plugin. 

    implementation("com.github.PPaszkiewicz:JitPackTest:0.4")
    
Android module properly available. Can also import specific submodules:

    implementation("com.github.PPaszkiewicz.JitPackTest:javaLib:0.4")
    implementation("com.github.PPaszkiewicz.JitPackTest:androidktlib:0.4")