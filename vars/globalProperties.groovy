class Load implements Serializable {
    
    def projectName
    def serverDomain
    def dynamicProperty
    
    Load() {
      this.projectName = "Project2"
      this.serverDomain = "Project2 server domain"
      
    }
  def call() {
      this.dynamicProperty = "${env.MSG} this is Dynamic property"
  }
}
