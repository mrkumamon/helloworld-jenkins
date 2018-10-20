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
        -data '{"title": "test","text":"this is dz.wu Testing"}'
  """)
}
