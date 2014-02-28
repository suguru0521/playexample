# Scala と SBT のインストール

Scala 開発を行うために以下をインストールします。

1. JDK
2. Scala
3. SBT

## Windows

### JDK のインストール

1. Webブラウザで以下にアクセスする。
http://www.oracle.com/technetwork/java/javase/downloads/index.html
2. JDK　の下の "Download" をクリックする。
3. "Accept License Agreement" にチェックを入れて、Windows x64 の .exe をダウンロードする。
もし 32bit OS を使っている場合には、x86 の方を使う。
4. ダウンロードしてきたインストーラを起動し、jdk　をインストールする。

### Scala のインストール

1. Webブラウザで以下にアクセスする。
http://www.scala-lang.org/download/
2. Scala 2.10.3 のインストーラをダウンロードする。
scala-2.10.3.msi
3. ダウンロードしてきたインストーラを起動し、Scala　をインストールする。

### SBT のインストール

1. Webブラウザで以下にアクセスする。
http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html
2. sbt 0.13.1 のインストーラをダウンロードする。
sbt.msi
3. ダウンロードしてきたインストーラを起動し、sbt　をインストールする。

## Mac OS X 

Mac では主に HomeBrew を使ってインストールを行います。


## HomeBrew のインストール

1. 以下のコマンドで HomeBrew をインストールする。
ruby -e "$(curl -fsSL https://raw.github.com/Homebrew/homebrew/go/install)"

### JDK のインストール

1. Webブラウザで以下にアクセスする。
http://www.oracle.com/technetwork/java/javase/downloads/index.html
2. JDK　の下の "Download" をクリックする。
3. "Accept License Agreement" にチェックを入れて、Mac OS X x64 の .dmg をダウンロードする。
4. ダウンロードしてきた .dmg をクリック(マウント)して表示される .pkg をダブルクリックして jdk　をインストールする。

### Scala のインストール

1. brew update
2. brew install scala

### SBT のインストール

1. brew update
2. brew install sbt

## 注意点

* 環境変数の設定
JAVA_HOME, SCALA_HOME, SBT_HOME
