package br.com.androidtest.core

fun String.getDescriptionIconFromUrl(): String {
    return this.split("-alternative").last()
}
