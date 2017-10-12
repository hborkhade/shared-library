class Load implements Serializable {
  
    def projectName
    def serverDomain
    def dynamicProperty
    def MSG1
    
    Load() {
      this.projectName = "Project2"
      this.serverDomain = "Project2 server domain"
      this.dynamicProperty = "${MSG1} this is Dynamic property"
    }
}
