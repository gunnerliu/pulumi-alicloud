// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package bastionhost

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Bastionhost Host Accounts of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.135.0+.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/bastionhost"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := bastionhost.GetHostAccounts(ctx, &bastionhost.GetHostAccountsArgs{
//				HostId:     "15",
//				InstanceId: "example_value",
//				Ids: []string{
//					"1",
//					"2",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("bastionhostHostAccountId1", ids.Accounts[0].Id)
//			nameRegex, err := bastionhost.GetHostAccounts(ctx, &bastionhost.GetHostAccountsArgs{
//				HostId:     "15",
//				InstanceId: "example_value",
//				NameRegex:  pulumi.StringRef("^my-HostAccount"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("bastionhostHostAccountId2", nameRegex.Accounts[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetHostAccounts(ctx *pulumi.Context, args *GetHostAccountsArgs, opts ...pulumi.InvokeOption) (*GetHostAccountsResult, error) {
	var rv GetHostAccountsResult
	err := ctx.Invoke("alicloud:bastionhost/getHostAccounts:getHostAccounts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHostAccounts.
type GetHostAccountsArgs struct {
	// Specify the new hosting account's name, support the longest 128 characters.
	HostAccountName *string `pulumi:"hostAccountName"`
	// Specifies the database where you want to create your hosting account's host ID.
	HostId string `pulumi:"hostId"`
	// A list of Host Account IDs.
	Ids []string `pulumi:"ids"`
	// Specifies the database where you want to create your hosting account's host bastion host ID of.
	InstanceId string `pulumi:"instanceId"`
	// A regex string to filter results by Host Account name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// Specify the new hosting account of the agreement name. Valid values: USING SSH and RDP.
	ProtocolName *string `pulumi:"protocolName"`
}

// A collection of values returned by getHostAccounts.
type GetHostAccountsResult struct {
	Accounts        []GetHostAccountsAccount `pulumi:"accounts"`
	HostAccountName *string                  `pulumi:"hostAccountName"`
	HostId          string                   `pulumi:"hostId"`
	// The provider-assigned unique ID for this managed resource.
	Id           string   `pulumi:"id"`
	Ids          []string `pulumi:"ids"`
	InstanceId   string   `pulumi:"instanceId"`
	NameRegex    *string  `pulumi:"nameRegex"`
	Names        []string `pulumi:"names"`
	OutputFile   *string  `pulumi:"outputFile"`
	ProtocolName *string  `pulumi:"protocolName"`
}

func GetHostAccountsOutput(ctx *pulumi.Context, args GetHostAccountsOutputArgs, opts ...pulumi.InvokeOption) GetHostAccountsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetHostAccountsResult, error) {
			args := v.(GetHostAccountsArgs)
			r, err := GetHostAccounts(ctx, &args, opts...)
			var s GetHostAccountsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetHostAccountsResultOutput)
}

// A collection of arguments for invoking getHostAccounts.
type GetHostAccountsOutputArgs struct {
	// Specify the new hosting account's name, support the longest 128 characters.
	HostAccountName pulumi.StringPtrInput `pulumi:"hostAccountName"`
	// Specifies the database where you want to create your hosting account's host ID.
	HostId pulumi.StringInput `pulumi:"hostId"`
	// A list of Host Account IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// Specifies the database where you want to create your hosting account's host bastion host ID of.
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
	// A regex string to filter results by Host Account name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Specify the new hosting account of the agreement name. Valid values: USING SSH and RDP.
	ProtocolName pulumi.StringPtrInput `pulumi:"protocolName"`
}

func (GetHostAccountsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHostAccountsArgs)(nil)).Elem()
}

// A collection of values returned by getHostAccounts.
type GetHostAccountsResultOutput struct{ *pulumi.OutputState }

func (GetHostAccountsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHostAccountsResult)(nil)).Elem()
}

func (o GetHostAccountsResultOutput) ToGetHostAccountsResultOutput() GetHostAccountsResultOutput {
	return o
}

func (o GetHostAccountsResultOutput) ToGetHostAccountsResultOutputWithContext(ctx context.Context) GetHostAccountsResultOutput {
	return o
}

func (o GetHostAccountsResultOutput) Accounts() GetHostAccountsAccountArrayOutput {
	return o.ApplyT(func(v GetHostAccountsResult) []GetHostAccountsAccount { return v.Accounts }).(GetHostAccountsAccountArrayOutput)
}

func (o GetHostAccountsResultOutput) HostAccountName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHostAccountsResult) *string { return v.HostAccountName }).(pulumi.StringPtrOutput)
}

func (o GetHostAccountsResultOutput) HostId() pulumi.StringOutput {
	return o.ApplyT(func(v GetHostAccountsResult) string { return v.HostId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetHostAccountsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetHostAccountsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetHostAccountsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetHostAccountsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetHostAccountsResultOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetHostAccountsResult) string { return v.InstanceId }).(pulumi.StringOutput)
}

func (o GetHostAccountsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHostAccountsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetHostAccountsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetHostAccountsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetHostAccountsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHostAccountsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetHostAccountsResultOutput) ProtocolName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHostAccountsResult) *string { return v.ProtocolName }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetHostAccountsResultOutput{})
}
