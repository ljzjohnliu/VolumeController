#!/bin/sh

gradle_compile_release()
{
    echo "build release start!"
    ./gradlew :app:clean
    ./gradlew :app:assembleRelease

    rm -rf out/
    mkdir -p out/apk
    cp app/build/outputs/apk/release/*.apk out/apk/VolumeController-release.apk
    adb install -r out/apk/VolumeController-release.apk
    adb shell am start -n com.ljz.volume/com.ljz.volume.MainActivity
    echo "build release end!"
}

gradle_compile_debug()
{
    echo "build debug start!"
    ./gradlew :app:clean
    ./gradlew :app:assembleDebug

    rm -rf out/
    mkdir -p out/apk
    cp app/build/outputs/apk/debug/*.apk out/apk/VolumeController-debug.apk
    adb install -r out/apk/VolumeController-debug.apk
    adb shell am start -n com.ljz.volume/com.ljz.volume.MainActivity
    echo "build debug end!"
}

Main()
{
    if [ "$1" == "0" ]; then
       gradle_compile_debug
    elif [ "$1" == "1" ]; then
       gradle_compile_release
    fi

    return $?
}

Main "$@"
