from math import pi
def deg_to_gms(deg, formats='string'):
    deg1 = int(deg)
    min = deg % 1 * 60
    sec = min % 1 * 60
    min = int(min)
    if formats == 'string':
         return  f'{deg1}° {min}мин {sec}сек '
def gms_to_deg(deg, min, sec):
    deg1 = min / 60 + deg
    return deg1
def deg_to_rad(deg):
    rad = deg * 180 * pi
    return rad
def rad_to_deg(rad):
    deg = rad / 180 / pi
    return deg
print(deg_to_gms(36.97))
print(gms_to_deg(36, 58, 11.9999999995907))
print(deg_to_rad(36))
print(rad_to_deg(deg_to_rad(36)))


