# dosukebe
オレオレ用のscalaライブラリを作ってみたいだけ。  
俺が使いたいから

[![Build Status](https://travis-ci.org/ugdark/dosukebe.svg?branch=master)](https://travis-ci.org/ugdark/dosukebe)


## core-modelについて

EntityはIdentifierがあって初めて実現できると思われる。  
なのでEmptyIdentifierを用意して永続化されてる状態とそうでない物を識別できる用にしてる。  
testにあるのは実装例のexampleみたいな事を想定してる。  



### 開発時ルール

#### はじめに

- doc作成用のグラフ描画ツール入れる

```bash
$ brew install graphviz
```


#### コミットする前に

```bash
sbt scalafmtCheck // fmt検証 fmtとcheckもうちょっと理解したい
sbt scalafmt // fmt実行 ideaにてpluginで適応されてるなら不要
sbt test:scalafmt // fmt実行 通常とtestはまとめられない?
sbt test  // テスト動作確認
```


#### doc作成

`target/scala-2.12/unidoc`に出力される

```bash
sbt unidoc
```

### creacode coverage

テストコードのカバー率のレポート  
`target/scala-2.12/scoverage-report`に出力される

```bash
sbt clean coverage test coverageReport coverageAggregate
```