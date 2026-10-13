from typing import Final


class Q1:
    NAME_LENGTH: Final[int] = 32

    @staticmethod
    def main():
        name = input("Enter name")[:Q1.NAME_LENGTH - 1]

        print(f"Hello {name}!!\n")


if __name__ == "__main__":
    Q1.main()
