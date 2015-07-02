package com.ikmr.banbara23.android_retrofit;

/**
 * http://qiita.com/HamaTech/items/5eacdecc29d943ba46f5
 * <p/>
 * レスポンス用のオブジェクトを生成
 * <p/>
 * jsonschema2pojoを利用してjsonから生成
 * http://www.jsonschema2pojo.org/
 * ※基本的には、Source typeはJSON、Annotation styleはNoneでOK
 * <p/>
 * 注意！！
 * レスポンスパラメータがスネークケースだと自動変換してくれないので、
 * サーバ側で返すパラメータはキャメルにしておきましょう
 */
public class ArticleList {
}
