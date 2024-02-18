package shop;

import java.util.Scanner;

public class Shop {

	int riceStock = 0;
	int ricePrice = 0;
	int dalStock = 0;
	int dalPrice = 0;
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Shop objShop = new Shop();
		objShop.Initialize();
		objShop.PrintStockValue();
		objShop.Sale();
	}

	private void PrintStockValue() {
		// TODO Auto-generated method stub
		System.out.println("Rice Stock : " + riceStock + "Kgs (Rs. " + ricePrice + "/- per Kg.)");
		System.out.println("Dal Stock : " + dalStock + "Kgs (Rs. " + dalPrice + "/- per Kg.)");
	}

	private void Sale() {
		boolean IsLoopActive = true;

		while (IsLoopActive) {
			System.out.println("What do you want to do?");
			System.out.println("1: View Stock");
			System.out.println("2: Add Stock");
			System.out.println("3: Sale");
			System.out.println("4: Change Price");
			System.out.println("5: Exit");

			int option = 0;
			option = scanner.nextInt();

			switch (option) {
			case 1:
				PrintStockValue();
				break;
			case 2:
				AddStockValue();
				break;
			case 3:
				SaleProduct();
				break;
			case 4:
				changePrice();
				break;
			case 5:
				IsLoopActive = false;
				break;
			}
		}
	}

	private void changePrice() {
		// TODO Auto-generated method stub

	}

	private void SaleProduct() {
		// TODO Auto-generated method stub

		System.out.println("What do you want to Buy");
		System.out.println("1: Rice");
		System.out.println("2: Dal");
		int option = scanner.nextInt();
		int billAmount = 0;
		if (option == 1) {
			System.out.println("How much rice do you want to Buy");
			int riceQuantity = scanner.nextInt();
			if (riceQuantity > riceStock) {
				System.out.println("Rice out of stock");
			} else {
				billAmount = riceQuantity * ricePrice;
				riceStock -= riceQuantity;
			}
		} else if (option == 2) {
			System.out.println("How much dal do you want to Buy");
			int dalQuantity = scanner.nextInt();
			if (dalQuantity > dalStock) {
				System.out.println("Dal out of stock");
			} else {
				billAmount = dalQuantity * dalPrice;
				dalStock -= dalQuantity;
			}
		}

		System.out.println("Bill Amount: " + billAmount);
		PrintStockValue();

	}

	private void AddStockValue() {
		// TODO Auto-generated method stub
		int refillRiceStock = 0;
		int refillDalStock = 0;
		System.out.println("Enter the Rice Stock in Kgs");
		refillRiceStock = scanner.nextInt();
		System.out.println("Enter the Dal Stock in Kgs");
		refillDalStock = scanner.nextInt();
		riceStock += refillRiceStock;
		dalStock += refillDalStock;
		PrintStockValue();

	}

	private void Initialize() {
		// TODO Auto-generated method stub

		System.out.println("Enter the Rice Stock in Kgs");
		riceStock = scanner.nextInt();
		System.out.println("Enter the Rice Price in rs");
		ricePrice = scanner.nextInt();
		System.out.println("Enter the Dal Stock in Kgs");
		dalStock = scanner.nextInt();
		System.out.println("Enter the Dal Price in rs");
		dalPrice = scanner.nextInt();

	}

}