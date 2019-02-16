#include<cstdio>
#include<iostream>
 
using namespace std;
 
string s, p;
 
void anagram(string a, string b, string c, string d, int n)
{
    if(n == s.length() * 2) 
    {
        if(b == p)
            cout << d << endl;
        return;
    }
 
    if(a.length() > 0)
        anagram(a.substr(1, a.length() - 1), b, c + a[0], d + (n == 0? "i" : " i"), n + 1);
    if(c.length() > 0 && c[c.length() - 1] == p[b.length()])
        anagram(a, b + c[c.length() - 1], c.substr(0, c.length() - 1), d + " o", n + 1);
}
 
int main() 
{
    while(cin >> s >> p) 
    {
        printf("[\n");
        if(s.length() == p.length())
            anagram(s, "", "", "", 0);
        printf("]\n");
    }
}
