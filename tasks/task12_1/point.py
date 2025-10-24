import math

class Point:
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

    # Distance from origin
    def distance(self) -> float:
        return math.hypot(self.x, self.y)

    # Distance to another point
    def distance_to(self, other: "Point") -> float:
        return math.hypot(self.x - other.x, self.y - other.y)


def main():
    try:
        x = float(input("Enter x coordinate: "))
        y = float(input("Enter y coordinate: "))
    except ValueError:
        print("Invalid input. Please enter valid numbers.")
        return

    p = Point(x, y)

    print(f"Distance from origin: {p.distance():.5f}")

    reference = Point(4.5, 7.0)
    print(f"Distance from (4.5, 7.0): {p.distance_to(reference):.5f}")


if __name__ == "__main__":
    main()
