class Load implements Serializable {
  
  def call ( body ) {

    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    
    def projectName
    def serverDomain
    def dynamicProperty
    def MSG1
    
    Load() {
      this.projectName = "Project2"
      this.serverDomain = "Project2 server domain"
      this.dynamicProperty = "${config.MSG1} this is Dynamic property"
    }
  }
}
