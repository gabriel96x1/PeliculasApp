# PeliculasApp

Para implementar la información de TMDB se descargará la información de la API REST, para posteriormente generar una database y añadirla al sistema para que al arrancar Room la db ya esté pre cargada y la app pueda trabajar de forma offline.

Para la segunda pantalla en la que se muetra la información de la pelicula selecionada, se pasará a la siguiente actividad el ID de la pelicula seleccionada, con lo que esta se irá a buscar a la DB para poder mostrar todos los detalles

Se usó un patron de diseño MVVM

Bibliotecas usadas:

    implementation 'androidx.core:core-ktx:1.7.0'
    implementation 'androidx.appcompat:appcompat:1.4.1'
    implementation 'com.google.android.material:material:1.5.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.3'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.4.1'
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1"

    // Coroutines
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0'

    //Dagger - Hilt
    implementation "com.google.dagger:hilt-android:2.38.1"
    kapt "com.google.dagger:hilt-android-compiler:2.37"
    implementation "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
    kapt "androidx.hilt:hilt-compiler:1.0.0"

    // Room
    implementation "androidx.room:room-runtime:2.4.2"
    kapt "androidx.room:room-compiler:2.4.2"

    // Kotlin Extensions and Coroutines support for Room
    implementation "androidx.room:room-ktx:2.4.2"
    
    
