plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.ksp) apply false
    alias(libs.plugins.navigation.safe.args) apply false
    id("com.google.dagger.hilt.android") apply false
}
