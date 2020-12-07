import pygame

pygame.init()
SCREENWIDTH = 500
SCREENHEIGHT = 500
win = pygame.display.set_mode((SCREENWIDTH, SCREENHEIGHT))
pygame.display.set_caption("First Game")

walkRigh = [pygame.image.load(r'img\R1.png'), pygame.image.load(r'img\R2.png'),
            pygame.image.load(r'img\R3.png'), pygame.image.load(r'img\R4.png'),
            pygame.image.load(r'img\R5.png'), pygame.image.load(r'img\R6.png'),
            pygame.image.load(r'img\R7.png'), pygame.image.load(r'img\R8.png'),
            pygame.image.load(r'img\R9.png')]

walkLeft = [pygame.image.load(r'img\L1.png'), pygame.image.load(r'img\L2.png'),
            pygame.image.load(r'img\L3.png'), pygame.image.load(r'img\L4.png'),
            pygame.image.load(r'img\L5.png'), pygame.image.load(r'img\L6.png'),
            pygame.image.load(r'img\L7.png'), pygame.image.load(r'img\L8.png'),
            pygame.image.load(r'img\L9.png')]

bg = pygame.image.load(r'img\bg.jpg')
char = pygame.image.load(r'img\standing.png')

clock = pygame.time.Clock()

x = 50
y = 350
width = 64
height = 64
vel = 5
isJumping = False
jumpCount = 10
left = False
right = False
walkCount = 0


def redrawGameWindow():
    global walkCount

    win.blit(bg, (0, 0))

    if walkCount + 1 >= 27:
        walkCount = 0

    if left:
        win.blit(walkLeft[walkCount//3], (x, y))
        walkCount += 1
    elif walkRigh:
        win.blit(walkRigh[walkCount//3], (x, y))
        walkCount += 1
    else:
        win.blit(char, (x, y))

    pygame.display.update()


# mainLoop
run = True
while run:
    clock.tick(27)

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            run = False

    keys = pygame.key.get_pressed()

    if keys[pygame.K_a] and x > vel:
        x -= vel
        left = True
        right = False
    elif keys[pygame.K_d] and x < (SCREENWIDTH - (width + 10)):
        x += vel
        left = False
        right = True
    else:
        left = False
        right = False
        walkCount = 0

    if not (isJumping):
        # if keys[pygame.K_w] and y > vel:
        #     y -= vel
        # if keys[pygame.K_s] and y < (SCREENHEIGHT - (height + 10)):
        #     y += vel
        if keys[pygame.K_SPACE]:
            isJumping = True
            left = False
            right = False
            walkCount = 0
    else:
        if jumpCount >= -10:
            neg = 1
            if jumpCount < 0:
                neg = -1
            y -= (jumpCount ** 2) * 0.5 * neg
            jumpCount -= 1
        else:
            isJumping = False
            jumpCount = 10

    redrawGameWindow()


pygame.quit()
