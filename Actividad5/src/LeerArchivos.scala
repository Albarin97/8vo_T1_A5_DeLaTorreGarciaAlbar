

object LeerArchivos {
  
  def contarLineasCodigo(l:Iterator[String]) : Unit = {
    var cont = 0;
    var cont2 = 0;
    
    while(l.hasNext){
      var str = l.next().toString()
      for(x <- 0 to str.length-1){
        if(str.substring(x, x+1)!="" || str.substring(x, x+1)!=" "){
          cont+=1
        }
      }
      if(cont>0){
        cont2+=1
      }
      cont=0
    }
    println("Contidad de lineas de codigo: "+cont2)
  }
  
  def contarLineasVacias(l:Iterator[String]) : Unit = {
   var cont = 0;
    var cont2 = 0;
    
    while(l.hasNext){
      var str = l.next().toString()
      for(x <- 0 to str.length-1){
        if(str.substring(x, x+1)!="" || str.substring(x, x+1)!=" "){
          cont+=1
        }
      }
      if(cont==0){
        cont2+=1
      }
      cont=0
    }
    println("Contidad de lineas vacias: "+cont2)
  }
  
  def parentecis(l:Iterator[String]) : Unit = {
    var parI = 0;
    var parD = 0;
    while(l.hasNext){
      var str = l.next().toString()
      for(x <- 0 to str.length-1){
        if(str.substring(x, x+1)=="("){
          parI+=1
        }else if(str.substring(x, x+1)==")"){
          parD+=1
        }
      }
    }
    println("Contidad de Parentecis balanceados: "+((parI+parD)/2))
  }
  
  def corchetes(l:Iterator[String]) : Unit = {
    var corI = 0;
    var corD = 0;
    while(l.hasNext){
      var str = l.next().toString()
      for(x <- 0 to str.length-1){
        if(str.substring(x, x+1)=="["){
          corI+=1
        }else if(str.substring(x, x+1)=="]"){
          corD+=1
        }
      }
    }
    println("Contidad de Corchetes balanceados: "+((corI+corD)/2))
  }
  
  def llaves(l:Iterator[String]) : Unit = {
    var llaI = 0;
    var llaD = 0;
    while(l.hasNext){
      var str = l.next().toString()
      for(x <- 0 to str.length-1){
        if(str.substring(x, x+1)=="{"){
          llaI+=1
        }else if(str.substring(x, x+1)=="}"){
          llaD+=1
        }
      }
    }
    println("Contidad de Llaves balanceadas: "+((llaI+llaD)/2))
  }
  def main(args: Array[String]): Unit = {
    val lineas = scala.io.Source.fromFile ("src/arc.txt").getLines
    contarLineasCodigo(lineas)
    val lineas2 = scala.io.Source.fromFile ("src/arc.txt").getLines
    contarLineasVacias(lineas2)
    val lineas3 = scala.io.Source.fromFile ("src/arc.txt").getLines
    parentecis(lineas3)
    val lineas4 = scala.io.Source.fromFile ("src/arc.txt").getLines
    llaves(lineas4)
    val lineas5 = scala.io.Source.fromFile ("src/arc.txt").getLines
    corchetes(lineas5)
    
  }
  
  
}