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