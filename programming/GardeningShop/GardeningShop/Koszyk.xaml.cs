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


namespace GardeningShop
{
    /// <summary>
    /// Logika interakcji dla klasy Koszyk.xaml
    /// </summary>
    public partial class Koszyk : Page
    {
        public Koszyk()
        {
            InitializeComponent();

            List<KoszykRekord> rekords = MainWindow.StanKoszyka.listaZakupow;
            foreach(KoszykRekord rek in rekords)
            {
                PrzedmiotyWKoszyku.Items.Add(rek);
            }

            CenaSum.Text = "Razem: " + MainWindow.StanKoszyka.cenaCalkowita.ToString("0.00") + "zł";
            
            //zrobic binding do pol ShopItem
            //dokonczyc zamowienie i baze danych


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

        private void ZamawiamBtnClick(object sender, RoutedEventArgs e)
        {
            Zamowienie noweZamowienie = new Zamowienie(MainWindow.StanKoszyka);
            SzczegolyZamowienia newpage = new SzczegolyZamowienia(noweZamowienie);

            NavigationService.Navigate(newpage);
        }
    }
   
}
