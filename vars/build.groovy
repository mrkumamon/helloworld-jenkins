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
      curl -X POST -H 'Content-type: application/json' --data '{"text":"Hello, World!"}' https://hooks.slack.com/services/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
  """)
}
