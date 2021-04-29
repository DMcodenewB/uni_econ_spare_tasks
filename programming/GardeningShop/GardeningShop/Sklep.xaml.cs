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
    /// Logika interakcji dla klasy Sklep.xaml
    /// </summary>
    public partial class Sklep : Page
    {
        public Sklep()
        {
            ShopItem item1 = new ShopItem("Słonecznik polski", "To jest słonecznik polski, po wyrośnięciu daje jadalne nasiona.", 2.99f, "ShopItems/slonecznik.jpg");
            ShopItem item2 = new ShopItem("Tulipan ogrodowy", "Tulipan, dający ładnie wyglądające kwiaty.", 3.49f, "ShopItems/tulipany.jpg");
            ShopItem item3 = new ShopItem("Rzodkiewka", "Soczysta, różowa rzodkiewka, wysiew wczesny.", 1.99f, "ShopItems/rzodkiewka.jpg");
            ShopItem item4 = new ShopItem("Dynia złota", "Dynia ogrodowa w kolorze złoto-pomarańczowym.", 2.59f, "ShopItems/dynia.jpg");
            ShopItem item5 = new ShopItem("Papryka ostra", "Papryka ostra Anaheim, wysiew średniowczesny", 4.99f, "ShopItems/papryka_ostra.jpg");
            ShopItem item6 = new ShopItem("Cebula", "Cebula ogrodowa, idealna do większości dań.", 0.99f, "ShopItems/cebula.jpg");
            ShopItem[] items = { item1, item2, item3, item4, item5, item6 };

            InitializeComponent();
        }
    }

    class ShopItem
    {
        public ShopItem(string itemName, string description, float price, string imagePath)
        {
            this.item_name = itemName;
            this.description = description;
            this.price = price;
            this.image_path = imagePath;
        }

        string item_name;
        string description;
        float price;
        string image_path;
        
    }
}
