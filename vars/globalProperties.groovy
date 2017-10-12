class Load implements Serializable {
  
  def call ( body ) {

    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    
    def projectName
    def serverDomain
    def dynamicProperty
    
    Load() {
      this.projectName = "Project2"
      this.serverDomain = "Project2 server domain"
      this.dynamicProperty = "${env.MSG} this is Dynamic property"
    }
  }
}
