package dependencies

object Dep {
    object GradlePlugin {
        val android = "com.android.tools.build:gradle:3.6.0-rc01"
        val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
    }

    object Test {
        val junit = "junit:junit:4.12"
        val testRunner = "androidx.test:runner:1.3.0-alpha02"
        val testRules = "androidx.test:rules:1.3.0-alpha02"
        val testCoreKtx = "androidx.test:core-ktx:1.2.1-alpha02"
        val androidJunit4Ktx = "androidx.test.ext:junit-ktx:1.1.2-alpha02"
        val liveDataTestingKtx = "com.jraska.livedata:testing-ktx:1.1.0"
    }

    object AndroidX {
        val appCompat = "androidx.appcompat:appcompat:1.1.0"
        val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"
        val constraint = "androidx.constraintlayout:constraintlayout:2.0.0-beta4"
        val emoji = "androidx.emoji:emoji-appcompat:1.0.0"
        val design = "com.google.android.material:material:1.2.0-alpha05"
        val coreKtx = "androidx.core:core-ktx:1.2.0-rc01"
        val preference = "androidx.preference:preference:1.1.0"
        val activityKtx = "androidx.activity:activity-ktx:1.1.0"
        val fragmentKtx = "androidx.fragment:fragment-ktx:1.2.2"

        val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata:2.2.0"
        val liveDataCoreKtx = "androidx.lifecycle:lifecycle-livedata-core-ktx:2.2.0"
        val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:2.2.0"

        object Room {
            val version = "2.2.3"
            val compiler = "androidx.room:room-compiler:$version"
            val runtime = "androidx.room:room-runtime:$version"
            val coroutine = "androidx.room:room-ktx:$version"
        }

        object Navigation {
            val version = "2.2.1"
            val runtimeKtx = "androidx.navigation:navigation-runtime-ktx:$version"
            val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$version"
            val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
            val dynamicFeaturesFragment =
                "androidx.navigation:navigation-dynamic-features-fragment:2.3.0-SNAPSHOT"
            val dynamicFeaturesRuntime =
                "androidx.navigation:navigation-dynamic-features-runtime:2.3.0-SNAPSHOT"
        }
    }

    object Kotlin {
        val version = "1.3.61"
        val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
        val coroutinesVersion = "1.3.3"
        val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
        val androidCoroutinesDispatcher =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
        val coroutinesReactive =
            "org.jetbrains.kotlinx:kotlinx-coroutines-reactive:$coroutinesVersion"
    }

    object OkHttp {
        val version = "4.0.1"
        val client = "com.squareup.okhttp3:okhttp:$version"
        val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$version"
        val okio = "com.squareup.okio:okio:1.14.0"
    }

    object Retrofit {
        val version = "2.7.2"
        val retrofit = "com.squareup.retrofit2:retrofit:$version"
        val converter = "com.squareup.retrofit2:converter-moshi:$version"
        val coroutine = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2"

    }

    object Koin {
        val version = "2.0.1"
        val koin = "org.koin:koin-android:$version"
        val lifecycle = "org.koin:koin-android-scope:$version"
        val viewModel = "org.koin:koin-android-viewmodel:$version"

    }

    object Epoxy {
        val version = "3.9.0"
        val epoxy = "com.airbnb.android:epoxy:$version"
        val processer = "com.airbnb.android:epoxy-processor:$version"
        val databindingSupport = "com.airbnb.android:epoxy-databinding:3.9e.0"
    }

}
