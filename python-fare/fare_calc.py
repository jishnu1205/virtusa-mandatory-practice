prices = {'Economy':10, 'Premium':18, 'SUV':25}

def farecalc(km, type, hr):
    if type not in prices:
        return None
    bf = km*prices[type]
    if hr>=17 and hr<=20:
        bf *= 1.5
    return bf

try:
    km = int(input("enter distance(km): "))
    typ = input("enter vehicle type(Economy/Premimum/SUV): ")
    hr = int(input("enter hour(0-23): "))

    fr = farecalc(km,typ,hr)
    if fr is None: print("service not available")
    else:
        print("\n----- Price Receipt -----")
        print(f"Distance       : {km} km")
        print(f"Vehicle Type   : {typ}")
        print(f"Time (Hour)    : {hr}")
        print(f"Total Fare     : ₹{fr:.2f}")
        print("--------------------------")
except Exception as e:
    print("Invalid Input")
