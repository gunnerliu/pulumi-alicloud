// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The SSL-VPN servers data source lists lots of SSL-VPN servers resource information owned by an Alicloud account.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "^foo"
// 		opt1 := "/tmp/sslserver"
// 		opt2 := "fake-vpn-id"
// 		_, err := vpc.GetSslVpnServers(ctx, &vpc.GetSslVpnServersArgs{
// 			Ids: []string{
// 				"fake-server-id",
// 			},
// 			NameRegex:    &opt0,
// 			OutputFile:   &opt1,
// 			VpnGatewayId: &opt2,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetSslVpnServers(ctx *pulumi.Context, args *GetSslVpnServersArgs, opts ...pulumi.InvokeOption) (*GetSslVpnServersResult, error) {
	var rv GetSslVpnServersResult
	err := ctx.Invoke("alicloud:vpc/getSslVpnServers:getSslVpnServers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSslVpnServers.
type GetSslVpnServersArgs struct {
	// IDs of the SSL-VPN servers.
	Ids []string `pulumi:"ids"`
	// A regex string of SSL-VPN server name.
	NameRegex *string `pulumi:"nameRegex"`
	// Save the result to the file.
	OutputFile *string `pulumi:"outputFile"`
	// Use the VPN gateway ID as the search key.
	VpnGatewayId *string `pulumi:"vpnGatewayId"`
}

// A collection of values returned by getSslVpnServers.
type GetSslVpnServersResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of SSL-VPN server IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of SSL-VPN server names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of SSL-VPN servers. Each element contains the following attributes:
	Servers []GetSslVpnServersServer `pulumi:"servers"`
	// The ID of the VPN gateway instance.
	VpnGatewayId *string `pulumi:"vpnGatewayId"`
}
