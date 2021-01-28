# AppAndroid

Tópicos Especiales
Integrantes: Jhoel Amagua, David Curipoma

Funciones básicas:
1. Suma, resta, multiplicación y división. En cada una de estas funciones se resiven 2 valores que luego realizaran la operación indicada.
    public double suma (double a, double b){
        return a+b;
    }

    public double resta (double a, double b){
        return a-b;
    }

    public double multiplicacion (double a, double b){
        return a*b;
    }
2. En la función división se realiza una validación para las divisiones para 0, en tal caso el resultado sera 0.
   
        public double division (double a, double b){
        double respuesta = 0;

        if (b!=0){
            respuesta=a/b;
        }
        return respuesta;
        }

Funciones adicionales:
1. Se tiene la funciones raiz cuadrada, raíz cúbica, potencia cuadrada, potencia cúbica, seno, coseno y tangente.
2. En cada una de estas funciones solo resive un valor que sera utilizado para realizar la operación.

    public double cuadrado (double a){
        return a*a;
    }

    public double cubo (double a){
        return (a*a)*a;
    }
    
3. Para las operaciones de raiz, seno, coseno y tangente, se hace uso de la libreria Math la cual nos provee estas operaciones.

    public double raiz_cuadrada (double a){
        return Math.sqrt(a);
    }

    public double raiz_cubo (double a){
        return Math.cbrt(a);
    }

    public double seno (double a){
        return Math.sin(a);
    }

    public double coseno (double a){
        return Math.cos(a);
    }

    public double tangente (double a){
        return Math.tan(a);
    }
    
Funcionalidad
Cada función es llamada respectivamente en cada botón asignado el cual luego de la acción clic dara la respuesta en la pantalla por medio de la acción
    "txt_respuesta.setText();" 
