
# GitHub ActionsでJavaプロジェクトをCI/CDする最小構成

このリポジトリは、**GitHub Actionsを使ってJava + Mavenプロジェクトをビルドし、成果物をArtifactsとして取得する最小構成のサンプル**です。

---

## 概要
- Java 21 + Maven
- GitHub Actionsでビルド＆テスト
- 成果物（JAR + バッチファイル）をArtifactsにアップロード

---

## 実行手順

### 1. リポジトリをFork
1. このリポジトリの右上にある **Fork** ボタンをクリック
2. 自分のGitHubアカウントにForkします

### 2. Actionsを有効化
Forkしたリポジトリでは、初期状態でGitHub Actionsが無効になっています。  
以下の手順で有効化してください：
1. Fork先のリポジトリで **Actions** タブを開く
2. 「Workflows aren't being run on this forked repository」という表示が出たら **I understand my workflows, go ahead and enable them** をクリック

### 3. ワークフローを実行
1. Actionsタブで `CI/CD Starter for GreetingService` ワークフローを選択
2. 「Run workflow」ボタンをクリック
3. 実行が完了すると、Artifactsが生成されます

### 4. 成果物をダウンロード
1. 実行結果ページで **Artifacts** をクリック
2. ダウンロードしたZIPを展開し、`scripts/GreetingService.bat` を実行
