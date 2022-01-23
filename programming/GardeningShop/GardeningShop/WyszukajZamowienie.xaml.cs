using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.IO;

namespace GardeningShop
{
    /// <summary>
    /// Logika interakcji dla klasy WyszukajZamowienie.xaml
    /// </summary>
    public partial class WyszukajZamowienie : Page
    {
        public WyszukajZamowienie()
        {
            InitializeComponent();
            wczytajZamowienia("Zamowienia.csv");
        }
        List<String> Zamowienia;

        private List<String> wczytajZamowienia(string nazwaPliku)
        {
            List<Zamowienie> zamowieniaZPliku = new List<Zamowienie>();
            StreamReader reader = new StreamReader(nazwaPliku);

            while (!reader.EndOfStream)
            {
                string buildInput = reader.ReadLine();
                string[] splitListFromFields = buildInput.Split(':');
                string[] fields = splitListFromFields[0].Split(';');
                string[] listItems = splitListFromFields[1].Split('|');


                List<KoszykRekord> rekordy = new List<KoszykRekord>();
                for(int i = 0; i < listItems.Length - 1; i++)
                {
                    string[] koszykFields = listItems[i].Split(';');
                    KoszykRekord rekord = new KoszykRekord(koszykFields[0], koszykFields[1], koszykFields[2]);
                    rekordy.Add(rekord);
                }
                
                StanKoszyka stan = new StanKoszyka(rekordy);
                Zamowienie zam = new Zamowienie(stan);

                zamowieniaZPliku.Add(zam);
            }

            reader.Close();
            return null;


        }

        private void LogoBtnClick(object sender, RoutedEventArgs e)
        {
            Homepage newpage = new Homepage();
            NavigationService.Navigate(newpage);
        }

        private void HomepageBtnClick(object sender, RoutedEventArgs e)
        {
            Homepage newpage = new Homepage();
            NavigationService.Navigate(newpage);
        }

        private void KontaktBtnClick(object sender, RoutedEventArgs e)
        {
            Kontakt newpage = new Kontakt();
            NavigationService.Navigate(newpage);
        }

        private void KoszykBtnClick(object sender, RoutedEventArgs e)
        {
            Koszyk newpage = new Koszyk();
            NavigationService.Navigate(newpage);
        }

        private void SklepBtnClick(object sender, RoutedEventArgs e)
        {
            Sklep newpage = new Sklep();
            NavigationService.Navigate(newpage);
        }

        private void SzukajBtnClick(object sender, RoutedEventArgs e)
        {

        }
    }
}
