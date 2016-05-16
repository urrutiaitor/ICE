module utils
{
  interface Calculator
  {
    int numOps( );
    int gcd( int a, int b);
    int factorial( int n);
  };
  
  sequence<Calculator*> CalculatorVector;
  
  interface CalculatorManager
  {
    void giveMeTheCalculators(out CalculatorVector calcVector);
  };
};
