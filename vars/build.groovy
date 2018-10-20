def call(body){
  //https://stackoverflow.com/questions/22865107/what-does-mean-in-groovy
  // creating a map
  //https://stackoverflow.com/questions/46573413/why-does-the-jenkinsfile-use-a-closure-in-this-way
  def config =[:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = config
  body()
}
