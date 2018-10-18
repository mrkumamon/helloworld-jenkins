def call(body){
  print("Hello Jenkins")
  def deployment={}
  deployment.telegramGroupName="This is a test"
  node {
      sendMsgToSlack()
  }
}
def sendMsgToSlack(){
      sh("""
        curl -X POST 'https://hooks.slack.com/services/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' \
        -H  'Content-type: application/json' \
        -H "Cache-Control: no-cache" \
        -d @- <<EOF {
          "title": "test",
          "text":"this is dz.wu Testing"
          }
        EOF
  """)
}
