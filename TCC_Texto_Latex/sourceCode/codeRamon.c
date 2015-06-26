#include 
using namespace std;
int main()
{
  /* comentario */
  int n, i, a = 0, b = 1, F;
  cout << "Digite o numero de termos da sequencia de Fibonacci: ";
   cin >> n;
  cout << a << " " << b << " ";
   for (i = 0; i < n - 2; i++)   {
     F = a + b;
     cout << F << " ";
     a = b;
     b = F;
   } cout << endl; return 0;
 }
