package br.com.translator.base;

public interface Translator<T, V> {
	T translate(V v);

}
