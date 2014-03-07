# Twitter クライアントアプリのセットアップ

あらかじめ用意した Twitter クライアントの雛形を使って開発を進めていきます。
[Scala(SBT)](https://github.com/algas/playexample/blob/master/ScalaInstall.md) および [Twitter API](https://github.com/algas/playexample/blob/master/TwitterApi.md) のセットアップが終わっているものとします。

## クライアントアプリのセットアップ

1. 以下のリポジトリを取得する。  
git clone git@github.com:algas/playexample.git  
(git pull で更新できます)
2. リポジトリディレクトリに移動する。  
cd playexample
3. 認証情報を入力する。  
cp conf/twitter.conf.example conf/twitter.conf  
twitter.conf の中身に記入する。  
詳しくは [Twitter API](https://github.com/algas/playexample/blob/master/TwitterApi.md) の認証情報の確認に書いてあります。
4. コンパイルを実行する。  
sbt compile
5. アプリケーションを起動する。  
sbt run
6. Webブラウザからアプリケーションにアクセスする。  
http://localhost:9000

設定が正しければ、twitter の timeline が表示されるはずです。

## 課題

サンプルのクライアントはいくつかの機能が不十分になっています。
以下の3つを基本課題とします。

### 基本課題

1. 投稿時刻の差分表示。  
現状では投稿時刻がそのまま表示されています。
現在時刻からの差分を取って、何分前の投稿かを表示するように修正しましょう。
2. アイコン画像の表示。  
現状では仮のアイコン画像(twitterのタマゴ)が表示されています。
各ユーザの画像を取得して表示するようにしてみましょう。
3. 投稿回数が3の倍数の時にアホになる機能。  
普通のクライアントではつまらないので、投稿回数が3の倍数の時にはアホなことをつぶやくように実装してみましょう。
どんなに意識の高い発言をしようとしてもアホなクライアントには通用しない！

### 基本課題のヒント
* 日付変換  
Locale に注意しましょう。
```scala
val dateFormatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy",Locale.ENGLISH)
```
* アイコン画像取得のAPI  
home_timeline にある profile_image_url という項目を読めば、画像が取得できます。

### 応用課題

1. Retweet, Favorite ボタン。  
Twitter API に用意してある機能をそのまま使うだけです。
2. Reply ボタン。  
@twitter_id も文頭に追加できるといいですね。
3. 自主課題。  
URL のリンク機能など欲しい機能があれば各自追加してみましょう。

## 参考文献

以下を見て勉強しましょう。

* Scala
    - [Scala Doc](http://www.scala-lang.org/api)
    - [Scala CheatSheets](http://docs.scala-lang.org/cheatsheets)
    - [Scala Cookbook](http://xerial.org/scala-cookbook)
    - [ひしだまさんのサイト](http://www.ne.jp/asahi/hishidama/home/tech/scala)
* Others
    - [Twitter Developers](https://dev.twitter.com)
    - [Twitter RestAPI](https://dev.twitter.com/docs/api/1.1)
    - [Play Framework](http://www.playframework-ja.org)
    - [Play2TwitterClient](https://github.com/tattyamm/Play2TwitterClient)
