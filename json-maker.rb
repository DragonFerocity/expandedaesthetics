if (ARGV.empty?)
  puts "Please specify the name of the object. ie glass_door_top.\nThis name will be used as the texture name, and JSON file name."
else
  $textureName = ARGV[0]
  File.open("src/main/resources/assets/expanded/blockstates/#{$textureName}_door.json", "w") do |f|
    $fileInput = "{
    \"variants\": {
        \"facing=east,half=lower,hinge=left,open=false,powered=true\":  { \"model\": \"expanded:doors/#{$textureName}_door_bottom\" },
        \"facing=south,half=lower,hinge=left,open=false,powered=true\": { \"model\": \"expanded:doors/#{$textureName}_door_bottom\", \"y\": 90 },
        \"facing=west,half=lower,hinge=left,open=false,powered=true\":  { \"model\": \"expanded:doors/#{$textureName}_door_bottom\", \"y\": 180 },
        \"facing=north,half=lower,hinge=left,open=false,powered=true\": { \"model\": \"expanded:doors/#{$textureName}_door_bottom\", \"y\": 270 },
        \"facing=east,half=lower,hinge=right,open=false,powered=true\":  { \"model\": \"expanded:doors/#{$textureName}_door_bottom_rh\" },
        \"facing=south,half=lower,hinge=right,open=false,powered=true\": { \"model\": \"expanded:doors/#{$textureName}_door_bottom_rh\", \"y\": 90 },
        \"facing=west,half=lower,hinge=right,open=false,powered=true\":  { \"model\": \"expanded:doors/#{$textureName}_door_bottom_rh\", \"y\": 180 },
        \"facing=north,half=lower,hinge=right,open=false,powered=true\": { \"model\": \"expanded:doors/#{$textureName}_door_bottom_rh\", \"y\": 270 },
        \"facing=east,half=lower,hinge=left,open=true,powered=true\":  { \"model\": \"expanded:doors/#{$textureName}_door_bottom_rh\", \"y\": 90 },
        \"facing=south,half=lower,hinge=left,open=true,powered=true\": { \"model\": \"expanded:doors/#{$textureName}_door_bottom_rh\", \"y\": 180 },
        \"facing=west,half=lower,hinge=left,open=true,powered=true\":  { \"model\": \"expanded:doors/#{$textureName}_door_bottom_rh\", \"y\": 270 },
        \"facing=north,half=lower,hinge=left,open=true,powered=true\": { \"model\": \"expanded:doors/#{$textureName}_door_bottom_rh\" },
        \"facing=east,half=lower,hinge=right,open=true,powered=true\":  { \"model\": \"expanded:doors/#{$textureName}_door_bottom\", \"y\": 270 },
        \"facing=south,half=lower,hinge=right,open=true,powered=true\": { \"model\": \"expanded:doors/#{$textureName}_door_bottom\" },
        \"facing=west,half=lower,hinge=right,open=true,powered=true\":  { \"model\": \"expanded:doors/#{$textureName}_door_bottom\", \"y\": 90 },
        \"facing=north,half=lower,hinge=right,open=true,powered=true\": { \"model\": \"expanded:doors/#{$textureName}_door_bottom\", \"y\": 180 },
        \"facing=east,half=upper,hinge=left,open=false,powered=true\":  { \"model\": \"expanded:doors/#{$textureName}_door_top\" },
        \"facing=south,half=upper,hinge=left,open=false,powered=true\": { \"model\": \"expanded:doors/#{$textureName}_door_top\", \"y\": 90 },
        \"facing=west,half=upper,hinge=left,open=false,powered=true\":  { \"model\": \"expanded:doors/#{$textureName}_door_top\", \"y\": 180 },
        \"facing=north,half=upper,hinge=left,open=false,powered=true\": { \"model\": \"expanded:doors/#{$textureName}_door_top\", \"y\": 270 },
        \"facing=east,half=upper,hinge=right,open=false,powered=true\":  { \"model\": \"expanded:doors/#{$textureName}_door_top_rh\" },
        \"facing=south,half=upper,hinge=right,open=false,powered=true\": { \"model\": \"expanded:doors/#{$textureName}_door_top_rh\", \"y\": 90 },
        \"facing=west,half=upper,hinge=right,open=false,powered=true\":  { \"model\": \"expanded:doors/#{$textureName}_door_top_rh\", \"y\": 180 },
        \"facing=north,half=upper,hinge=right,open=false,powered=true\": { \"model\": \"expanded:doors/#{$textureName}_door_top_rh\", \"y\": 270 },
        \"facing=east,half=upper,hinge=left,open=true,powered=true\":  { \"model\": \"expanded:doors/#{$textureName}_door_top_rh\", \"y\": 90 },
        \"facing=south,half=upper,hinge=left,open=true,powered=true\": { \"model\": \"expanded:doors/#{$textureName}_door_top_rh\", \"y\": 180 },
        \"facing=west,half=upper,hinge=left,open=true,powered=true\":  { \"model\": \"expanded:doors/#{$textureName}_door_top_rh\", \"y\": 270 },
        \"facing=north,half=upper,hinge=left,open=true,powered=true\": { \"model\": \"expanded:doors/#{$textureName}_door_top_rh\" },
        \"facing=east,half=upper,hinge=right,open=true,powered=true\":  { \"model\": \"expanded:doors/#{$textureName}_door_top\", \"y\": 270 },
        \"facing=south,half=upper,hinge=right,open=true,powered=true\": { \"model\": \"expanded:doors/#{$textureName}_door_top\" },
        \"facing=west,half=upper,hinge=right,open=true,powered=true\":  { \"model\": \"expanded:doors/#{$textureName}_door_top\", \"y\": 90 },
        \"facing=north,half=upper,hinge=right,open=true,powered=true\": { \"model\": \"expanded:doors/#{$textureName}_door_top\", \"y\": 180 },
        \"facing=east,half=lower,hinge=left,open=false,powered=false\":  { \"model\": \"expanded:doors/#{$textureName}_door_bottom\" },
        \"facing=south,half=lower,hinge=left,open=false,powered=false\": { \"model\": \"expanded:doors/#{$textureName}_door_bottom\", \"y\": 90 },
        \"facing=west,half=lower,hinge=left,open=false,powered=false\":  { \"model\": \"expanded:doors/#{$textureName}_door_bottom\", \"y\": 180 },
        \"facing=north,half=lower,hinge=left,open=false,powered=false\": { \"model\": \"expanded:doors/#{$textureName}_door_bottom\", \"y\": 270 },
        \"facing=east,half=lower,hinge=right,open=false,powered=false\":  { \"model\": \"expanded:doors/#{$textureName}_door_bottom_rh\" },
        \"facing=south,half=lower,hinge=right,open=false,powered=false\": { \"model\": \"expanded:doors/#{$textureName}_door_bottom_rh\", \"y\": 90 },
        \"facing=west,half=lower,hinge=right,open=false,powered=false\":  { \"model\": \"expanded:doors/#{$textureName}_door_bottom_rh\", \"y\": 180 },
        \"facing=north,half=lower,hinge=right,open=false,powered=false\": { \"model\": \"expanded:doors/#{$textureName}_door_bottom_rh\", \"y\": 270 },
        \"facing=east,half=lower,hinge=left,open=true,powered=false\":  { \"model\": \"expanded:doors/#{$textureName}_door_bottom_rh\", \"y\": 90 },
        \"facing=south,half=lower,hinge=left,open=true,powered=false\": { \"model\": \"expanded:doors/#{$textureName}_door_bottom_rh\", \"y\": 180 },
        \"facing=west,half=lower,hinge=left,open=true,powered=false\":  { \"model\": \"expanded:doors/#{$textureName}_door_bottom_rh\", \"y\": 270 },
        \"facing=north,half=lower,hinge=left,open=true,powered=false\": { \"model\": \"expanded:doors/#{$textureName}_door_bottom_rh\" },
        \"facing=east,half=lower,hinge=right,open=true,powered=false\":  { \"model\": \"expanded:doors/#{$textureName}_door_bottom\", \"y\": 270 },
        \"facing=south,half=lower,hinge=right,open=true,powered=false\": { \"model\": \"expanded:doors/#{$textureName}_door_bottom\" },
        \"facing=west,half=lower,hinge=right,open=true,powered=false\":  { \"model\": \"expanded:doors/#{$textureName}_door_bottom\", \"y\": 90 },
        \"facing=north,half=lower,hinge=right,open=true,powered=false\": { \"model\": \"expanded:doors/#{$textureName}_door_bottom\", \"y\": 180 },
        \"facing=east,half=upper,hinge=left,open=false,powered=false\":  { \"model\": \"expanded:doors/#{$textureName}_door_top\" },
        \"facing=south,half=upper,hinge=left,open=false,powered=false\": { \"model\": \"expanded:doors/#{$textureName}_door_top\", \"y\": 90 },
        \"facing=west,half=upper,hinge=left,open=false,powered=false\":  { \"model\": \"expanded:doors/#{$textureName}_door_top\", \"y\": 180 },
        \"facing=north,half=upper,hinge=left,open=false,powered=false\": { \"model\": \"expanded:doors/#{$textureName}_door_top\", \"y\": 270 },
        \"facing=east,half=upper,hinge=right,open=false,powered=false\":  { \"model\": \"expanded:doors/#{$textureName}_door_top_rh\" },
        \"facing=south,half=upper,hinge=right,open=false,powered=false\": { \"model\": \"expanded:doors/#{$textureName}_door_top_rh\", \"y\": 90 },
        \"facing=west,half=upper,hinge=right,open=false,powered=false\":  { \"model\": \"expanded:doors/#{$textureName}_door_top_rh\", \"y\": 180 },
        \"facing=north,half=upper,hinge=right,open=false,powered=false\": { \"model\": \"expanded:doors/#{$textureName}_door_top_rh\", \"y\": 270 },
        \"facing=east,half=upper,hinge=left,open=true,powered=false\":  { \"model\": \"expanded:doors/#{$textureName}_door_top_rh\", \"y\": 90 },
        \"facing=south,half=upper,hinge=left,open=true,powered=false\": { \"model\": \"expanded:doors/#{$textureName}_door_top_rh\", \"y\": 180 },
        \"facing=west,half=upper,hinge=left,open=true,powered=false\":  { \"model\": \"expanded:doors/#{$textureName}_door_top_rh\", \"y\": 270 },
        \"facing=north,half=upper,hinge=left,open=true,powered=false\": { \"model\": \"expanded:doors/#{$textureName}_door_top_rh\" },
        \"facing=east,half=upper,hinge=right,open=true,powered=false\":  { \"model\": \"expanded:doors/#{$textureName}_door_top\", \"y\": 270 },
        \"facing=south,half=upper,hinge=right,open=true,powered=false\": { \"model\": \"expanded:doors/#{$textureName}_door_top\" },
        \"facing=west,half=upper,hinge=right,open=true,powered=false\":  { \"model\": \"expanded:doors/#{$textureName}_door_top\", \"y\": 90 },
        \"facing=north,half=upper,hinge=right,open=true,powered=false\": { \"model\": \"expanded:doors/#{$textureName}_door_top\", \"y\": 180 }
    }
}"
    f << $fileInput
  end
  File.open("src/main/resources/assets/expanded/models/block/doors/#{$textureName}_door_bottom.json", "w") do |f|
    $fileInput = "{
    \"parent\": \"block/door_bottom\",
    \"textures\": {
        \"bottom\": \"expanded:blocks/doors/#{$textureName}_door_lower\",
        \"top\": \"expanded:blocks/doors/#{$textureName}_door_upper\"
    }
}"
    f << $fileInput
  end
  File.open("src/main/resources/assets/expanded/models/block/doors/#{$textureName}_door_bottom_rh.json", "w") do |f|
    $fileInput = "{
    \"parent\": \"block/door_bottom_rh\",
    \"textures\": {
        \"bottom\": \"expanded:blocks/doors/#{$textureName}_door_lower\",
        \"top\": \"expanded:blocks/doors/#{$textureName}_door_upper\"
    }
}"
    f << $fileInput
  end
  File.open("src/main/resources/assets/expanded/models/block/doors/#{$textureName}_door_top.json", "w") do |f|
    $fileInput = "{
    \"parent\": \"block/door_top\",
    \"textures\": {
        \"bottom\": \"expanded:blocks/doors/#{$textureName}_door_lower\",
        \"top\": \"expanded:blocks/doors/#{$textureName}_door_upper\"
    }
}"
    f << $fileInput
  end
  File.open("src/main/resources/assets/expanded/models/block/doors/#{$textureName}_door_top_rh.json", "w") do |f|
    $fileInput = "{
    \"parent\": \"block/door_top_rh\",
    \"textures\": {
        \"bottom\": \"expanded:blocks/doors/#{$textureName}_door_lower\",
        \"top\": \"expanded:blocks/doors/#{$textureName}_door_upper\"
    }
}"
    f << $fileInput
  end
  File.open("src/main/resources/assets/expanded/models/item/#{$textureName}_door.json", "w") do |f|
    $fileInput = "{
    \"parent\": \"item/generated\",
    \"textures\": {
        \"layer0\": \"expanded:items/#{$textureName}_door\"
    }
}"
    f << $fileInput
  end
  puts "6 files created for #{$textureName}!"
end