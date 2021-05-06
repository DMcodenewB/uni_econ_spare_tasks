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
            Items = new List<ShopItem>();

            Items.Add(new ShopItem
            {
                item_name = "Słonecznik polski",
                description = "To jest słonecznik polski, po wyrośnięciu daje jadalne nasiona.",
                price = 2.99f,
                image_path = "ShopItems/slonecznik.jpg"
            });
            Items.Add(new ShopItem
            {
                item_name = "Tulipan ogrodowy",
                description = "Tulipan, dający ładnie wyglądające kwiaty.",
                price = 3.49f,
                image_path = "ShopItems/tulipany.jpg"
            });
            Items.Add(new ShopItem
            {
                item_name = "Rzodkiewka",
                description = "Soczysta, różowa rzodkiewka, wysiew wczesny.",
                price = 1.99f,
                image_path = "ShopItems/rzodkiewka.jpg"
            });
            Items.Add(new ShopItem
            {
                item_name = "Dynia złota",
                description = "Dynia ogrodowa w kolorze złoto-pomarańczowym.",
                price = 2.59f,
                image_path = "ShopItems/dynia.jpg"
            });
            Items.Add(new ShopItem
            {
                item_name = "Papryka ostra",
                description = "Papryka ostra Anaheim, wysiew średniowczesny.",
                price = 4.99f,
                image_path = "ShopItems/papryka_ostra.jpg"
            });
            Items.Add(new ShopItem
            {
                item_name = "Cebula",
                description = "Cebula ogrodowa, idealna do większości dań.",
                price = 0.99f,
                image_path = "ShopItems/cebula.jpg"
            });

            InitializeComponent();

            int rowColIndex = 0;

            Items.ForEach(delegate (ShopItem item) {
                Grid itemGrid = new Grid();
                RowDefinition row1 = new RowDefinition();
                RowDefinition row2 = new RowDefinition();
                row1.Height = new GridLength(3, GridUnitType.Star);
                row2.Height = new GridLength(1, GridUnitType.Star);

                itemGrid.RowDefinitions.Add(row1);
                itemGrid.RowDefinitions.Add(row2);

                Rectangle imageRect = new Rectangle();
                imageRect.Margin = new Thickness(10, 10, 10, 0);
                imageRect.Fill = new ImageBrush(new BitmapImage(new Uri("../../" + item.image_path, UriKind.Relative)));

                Button cartButton = new Button();
                cartButton.Height = 25;
                cartButton.VerticalAlignment = VerticalAlignment.Bottom;
                cartButton.HorizontalAlignment = HorizontalAlignment.Stretch;
                cartButton.Margin = new Thickness(10, 0, 10, 0);

                LinearGradientBrush brush = new LinearGradientBrush(
                    Color.FromRgb(127, 166, 1),
                    Color.FromRgb(38, 139, 7),
                    new Point(0, 0),
                    new Point(0, 1)
                    );

                cartButton.Background = brush;
                cartButton.Content = "Do koszyka";
                

                TextBlock textBlock = new TextBlock();
                textBlock.Inlines.Add(new Run(item.item_name + " "));
                textBlock.Inlines.Add(new Run(item.price + "zł"));

                textBlock.Margin = new Thickness(10, 0, 10, 5);
                
                textBlock.Background = Brushes.WhiteSmoke;
                textBlock.FontSize = 16;
                textBlock.FontFamily = new FontFamily("Georgia");
                textBlock.FontWeight = FontWeights.ExtraLight;
                textBlock.TextAlignment = TextAlignment.Center;
                textBlock.VerticalAlignment = VerticalAlignment.Stretch;
                textBlock.TextWrapping = TextWrapping.Wrap;
                textBlock.FontStretch = FontStretches.Normal;

                

                itemGrid.Children.Add(imageRect);
                Grid.SetRow(imageRect, 0);
                Grid.SetColumn(imageRect, 0);

                itemGrid.Children.Add(cartButton);
                Grid.SetRow(cartButton, 0);

                itemGrid.Children.Add(textBlock);
                Grid.SetRow(textBlock, 1);

                ShopGrid.Children.Add(itemGrid);
                Grid.SetRow(itemGrid, rowColIndex % 2);
                Grid.SetColumn(itemGrid, rowColIndex % 3);
                rowColIndex++;

            });
            
        }

        public List<ShopItem> Items { get; set; }



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
    }
}
