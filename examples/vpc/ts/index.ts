import * as pulumi from "@pulumi/pulumi";
import * as alicloud from "@pulumi/alicloud";

const cbcTestTenant = new alicloud.ocean.Tenant("cbcTestTenant", {
    tenantName: "cbcTestTenant",
    cpu: 1,
    memory: 1,
    timeZone: "Asia/Shanghai",
    tenantMode: "MySQL",
    charset: "utf8mb4",
    instanceId: "ob5jdb0b3t68tc",
    userVpcId: "vpc-bp1wthpj1estmaf84tu1b",
    userVSwitchId: "vsw-bp1mthjmn4gneuvz5qwdz",
    primaryZone: "cn-hangzhou-j"
})