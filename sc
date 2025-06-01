local mouse = game.Players.LocalPlayer:GetMouse()
local lib = loadstring(game:HttpGet("https://raw.githubusercontent.com/danyad22/jndfsnas/refs/heads/main/sup", true))();
local target = ""
mouse.Button1Down:Connect(function()
	local t = mouse.Target
	if t.Parent:FindFirstChild("Humanoid") ~= nil then
		target = t.Parent.Name
	elseif t.Parent.Parent:FindFirstChild("Humanoid") ~= nil then
		target = t.Parent.Parent.Name
	else
		target = ""
	end
end)
workspace[game.Players.LocalPlayer.Name].Archivable = true
local clone = workspace[game.Players.LocalPlayer.Name]:Clone()
clone.Humanoid.AutoRotate = false
for i,v in pairs(clone:GetDescendants()) do
	if v:IsA("BasePart") then
		v.Transparency = 0.6
	end
end
local char = game.Players.LocalPlayer.Character
clone.Parent = workspace

spawn(function()
	while true do
		task.wait()
		game.Players.LocalPlayer.Character = clone
		pcall(function()
			if target ~= "" then
				clone.HumanoidRootPart.CFrame = game.Players[target].Character.HumanoidRootPart.CFrame - game.Players[target].Character.HumanoidRootPart.CFrame.LookVector*1.35
				clone.HumanoidRootPart.Anchored = true
			else
				clone.HumanoidRootPart.CFrame = CFrame.new(clone.HumanoidRootPart.CFrame.Position, clone.HumanoidRootPart.CFrame.Position + Vector3.new(workspace.CurrentCamera.CFrame.LookVector.X,0,workspace.CurrentCamera.CFrame.LookVector.Z))
				clone.HumanoidRootPart.Anchored = false
			end
		end)
	end
end)

local lefta = Instance.new("Weld", clone["Left Arm"])
local leftl = Instance.new("Weld", clone["Left Leg"])
local righta = Instance.new("Weld", clone["Right Arm"])
local rightl = Instance.new("Weld", clone["Right Leg"])
local torso = Instance.new("Weld", clone["Torso"])
local head = Instance.new("Weld", clone["Head"])

lefta.Part0 = clone["Left Arm"]
lefta.Part1 = clone["Torso"]
leftl.Part0 = clone["Left Leg"]
leftl.Part1 = clone["Torso"]
righta.Part0 = clone["Right Arm"]
righta.Part1 = clone["Torso"]
rightl.Part0 = clone["Right Leg"]
rightl.Part1 = clone["Torso"]
torso.Part0 = clone["Torso"]
torso.Part1 = clone["HumanoidRootPart"]
head.Part0 = clone["Head"]
head.Part1 = clone["Torso"]

spawn(function()
	while true do
		task.wait()
		--char.Humanoid:ChangeState(Enum.HumanoidStateType.StrafingNoPhysics)
		for i,v in pairs(char:GetDescendants()) do
			if v:IsA("BasePart") then
				v.CanCollide = false
			end
		end
	end
end)

for i,v in pairs(char:GetDescendants()) do
	for i,z in pairs(clone:GetDescendants()) do
		if v.Name == z.Name and v:IsA("BasePart") and v.Name ~= "HumanoidRootPart" then
			game:GetService("RunService").PostSimulation:Connect(function()
				v.CFrame = z.CFrame
				v.Velocity = Vector3.new(0,1,0)
				v.AssemblyAngularVelocity = Vector3.new(0,1,0)
				v.AssemblyLinearVelocity = Vector3.new(0,1,0)
			end)
		elseif v.Name == "HumanoidRootPart" then
			game:GetService("RunService").PostSimulation:Connect(function()
				v.CFrame = clone.Torso.CFrame
				v.Velocity = Vector3.new(0,1,0)
				v.AssemblyAngularVelocity = Vector3.new(0,1,0)
				v.AssemblyLinearVelocity = Vector3.new(0,1,0)
			end)
		end
	end
end
local tweenserv = game.TweenService
local ll2 = tweenserv:Create(leftl, TweenInfo.new(.45, Enum.EasingStyle.Quart, Enum.EasingDirection.InOut), {C1 = CFrame.new(-0.5, -2, 0.25, 1, 0, 0, 0, 0.96126169, 0.275637358, 0, -0.275637358, 0.96126169)})
local rl2 = tweenserv:Create(rightl, TweenInfo.new(.45, Enum.EasingStyle.Quart, Enum.EasingDirection.InOut), {C1 = CFrame.new(0.5, -2, 0.25, 1, 0, 0, 0, 0.96126169, 0.275637358, 0, -0.275637358, 0.96126169)})
local la2 = tweenserv:Create(lefta, TweenInfo.new(.45, Enum.EasingStyle.Quart, Enum.EasingDirection.InOut), {C1 = CFrame.new(-1.5, 0, -0.5, 1, 0, 0, 0, 0.874619722, -0.484809607, 0, 0.484809607, 0.874619722)})
local ra2 = tweenserv:Create(righta, TweenInfo.new(.45, Enum.EasingStyle.Quart, Enum.EasingDirection.InOut), {C1 = CFrame.new(1.5, 0, -0.5, 1, 0, 0, 0, 0.874619722, -0.484809607, 0, 0.484809607, 0.874619722)})
local torsoo2 = tweenserv:Create(torso, TweenInfo.new(.45, Enum.EasingStyle.Quart, Enum.EasingDirection.InOut), {C1 = CFrame.new(0, 0, 0, 1, 0, 0, 0, 0.96126169, -0.275637358, 0, 0.275637358, 0.96126169)})
local headd2 = tweenserv:Create(head, TweenInfo.new(.45, Enum.EasingStyle.Quart, Enum.EasingDirection.InOut), {C1 = CFrame.new(0, 1.5, -0.150000006, 1, 0, 0, 0, 0.96126169, 0.275637358, 0, -0.275637358, 0.96126169)})
local ll3 = tweenserv:Create(leftl, TweenInfo.new(.45, Enum.EasingStyle.Quart, Enum.EasingDirection.InOut), {C1 = CFrame.new(-0.600000024, -1.5, -0.800000012, 0.990268052, 0.139173105, 0, -0.13705875, 0.97522366, 0.173648193, 0.0241671577, -0.171958253, 0.98480773)})
local rl3 = tweenserv:Create(rightl, TweenInfo.new(.45, Enum.EasingStyle.Quart, Enum.EasingDirection.InOut), {C1 = CFrame.new(0.600000024, -1.5, -0.800000012, 0.990268052, -0.139173105, 0, 0.13705875, 0.97522366, 0.173648193, -0.0241671577, -0.171958253, 0.98480773)})
local la3 = tweenserv:Create(righta, TweenInfo.new(.45, Enum.EasingStyle.Quart, Enum.EasingDirection.InOut), {C1 = CFrame.new(1.5, 0.5, -0.5, 1, 0, 0, 0, -4.37113883e-08, -1, 0, 1, -4.37113883e-08)})
local ra3 = tweenserv:Create(head, TweenInfo.new(.45, Enum.EasingStyle.Quart, Enum.EasingDirection.InOut), {C1 = CFrame.new(0, 1.5, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1)})
local torsoo3 = tweenserv:Create(lefta, TweenInfo.new(.45, Enum.EasingStyle.Quart, Enum.EasingDirection.InOut), {C1 = CFrame.new(-1.5, 0.5, -0.5, 1, 0, 0, 0, -4.37113883e-08, -1, 0, 1, -4.37113883e-08)})
local headd3 = tweenserv:Create(torso, TweenInfo.new(.45, Enum.EasingStyle.Quart, Enum.EasingDirection.InOut), {C1 = CFrame.new(0, -1.5, 0, 1, 0, 0, 0, 0.173647985, 0.984807789, 0, -0.984807789, 0.173647985)})
local ll1 = tweenserv:Create(leftl, TweenInfo.new(.45, Enum.EasingStyle.Quart, Enum.EasingDirection.InOut), {C1 = CFrame.new(-0.5, -2, -0.25, 1, 0, 0, 0, 0.96126169, -0.275637358, 0, 0.275637358, 0.96126169)})
local rl1 = tweenserv:Create(rightl, TweenInfo.new(.45, Enum.EasingStyle.Quart, Enum.EasingDirection.InOut), {C1 = CFrame.new(0.5, -2, -0.25, 1, 0, 0, 0, 0.96126169, -0.275637358, 0, 0.275637358, 0.96126169)})
local la1 = tweenserv:Create(lefta, TweenInfo.new(.45, Enum.EasingStyle.Quart, Enum.EasingDirection.InOut), {C1 = CFrame.new(-1.5, 0, -0.5, 1, 0, 0, 0, 0.707106769, -0.707106769, 0, 0.707106769, 0.707106769)})
local ra1 = tweenserv:Create(righta, TweenInfo.new(.45, Enum.EasingStyle.Quart, Enum.EasingDirection.InOut), {C1 = CFrame.new(1.5, 0, -0.5, 1, 0, 0, 0, 0.707106769, -0.707106769, 0, 0.707106769, 0.707106769)})
local torsoo1 = tweenserv:Create(torso, TweenInfo.new(.45, Enum.EasingStyle.Quart, Enum.EasingDirection.InOut), {C1 = CFrame.new(0, 0, 0, 1, 0, 0, 0, 0.96126169, 0.275637358, 0, -0.275637358, 0.96126169)})
local headd1 = tweenserv:Create(head, TweenInfo.new(.45, Enum.EasingStyle.Quart, Enum.EasingDirection.InOut), {C1 = CFrame.new(0, 1.5, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1)})

mouse.KeyDown:Connect(function(k)
	if k == "z" then
		ll1:Play()
		rl1:Play()
		la1:Play()
		ra1:Play()
		torsoo1:Play()
		headd1:Play()
	end
	if k == "x" then
		ll2:Play()
		rl2:Play()
		la2:Play()
		ra2:Play()
		torsoo2:Play()
		headd2:Play()
	end
	if k == "c" then
		lefta.C1 = CFrame.new(-1.5, 0, 0)
		righta.C1 = CFrame.new(1.5, 0, 0)
		leftl.C1 = CFrame.new(-0.5, -2, 0)
		rightl.C1 = CFrame.new(0.5, -2, 0)
		head.C1 = CFrame.new(0, 1.5, 0)
		torso.C1 = CFrame.new(0, 0, 0)
	end
	if k == "v" then
		ll3:Play()
		rl3:Play()
		la3:Play()
		ra3:Play()
		torsoo3:Play()
		headd3:Play()
	end
end)

--while true do
--	ll1:Play()
--	rl1:Play()
--	la1:Play()
--	ra1:Play()
--	torsoo1:Play()
--	headd1:Play()
--	torsoo1.Completed:Wait()
--	ll2:Play()
--	rl2:Play()
--	la2:Play()
--	ra2:Play()
--	torsoo2:Play()
--	headd2:Play()
--	torsoo2.Completed:Wait()
--end
