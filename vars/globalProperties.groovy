class Load implements Serializable {
    
    def projectName
    def serverDomain
    def dynamicProperty
    
    Load(SomeMSG) {
      this.projectName = "Project2"
      this.serverDomain = "Project2 server domain"
      this.dynamicProperty = "${SomeMSG} this is Dynamic property"
    }
  
}
