# Twitter API を使う

Twitter API を利用してタイムラインを読んだりツイートしたりすることができます。
以下の手順で twitter api を使うための準備を行います。

## 手順

1. twitter アカウントを作成する。
既にアカウントを持っている人はそれを使っても構いません。
https://twitter.com/
2. twitter 開発者登録をする。
https://dev.twitter.com/
twitter アカウントを使って signin を行います。
3. アプリを登録する。
"My Applications" から "Create New App" をクリックして "Name" にアプリ名を入力します。
"Name" は変更不可ですが、変えたくなったら新しく作成しなおせば問題ありません。
4. Permissions を変更する。
アプリケーションページで "Permissions" を "Read only" から "Read and Write" に変更します。
この変更をしないとツイートできません。
5. Access Token を発行する。
"Regenerate my access token" をクリックしてアクセストークンを発行します。
"Access level" が　"Read and Write" になっていることを確認します。

これで設定完了です。
設定が終わったら正しく設定されているか動作確認を行いましょう。

## 動作確認

アプリケーションページで twitter の timeline を読むのと、tweet をするテストを行います。
Windows の人は curl が入ってないから使えないかもしれない。

### timeline を読む

1. Test OAuth をクリックする。
2. OAuth Settings の4つの項目に値がすべて入っていることを確認する。
3. Request Settings で　Request type を GET にする。
4. Request URI に以下の URI を入力する。
https://api.twitter.com/1.1/statuses/home_timeline.json
5. See OAuth signature for this request をクリックする。
6. cURL command の項目をクリップボードにコピーします。
7. ターミナルに貼り付けて curl command を実行します。

### tweet する

1. Test OAuth をクリックする。
2. OAuth Settings の4つの項目に値がすべて入っていることを確認する。
3. Request Settings で　Request type を POST にする。
4. Request URI に以下の URI を入力する。
https://api.twitter.com/1.1/statuses/update.json
5. Request query に以下の URI を入力する。
status=test
6. See OAuth signature for this request をクリックする。
7. cURL command の項目をクリップボードにコピーします。
8. ターミナルに貼り付けて curl command を実行します。

## 参考文献

* [Twitter RestAPI](https://dev.twitter.com/docs/api/1.1)
