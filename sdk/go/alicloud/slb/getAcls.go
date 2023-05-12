// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package slb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the acls in the region.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/slb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			sampleDs, err := slb.GetAcls(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstSlbAclId", sampleDs.Acls[0].Id)
//			return nil
//		})
//	}
//
// ```
// ## Entry Block
//
// The entry mapping supports the following:
//
// * `entry`   - An IP addresses or CIDR blocks.
// * `comment` - the comment of the entry.
//
// ## Listener Block
//
// The Listener mapping supports the following:
//
// * `loadBalancerId` - the id of load balancer instance, the listener belongs to.
// * `frontendPort` - the listener port.
// * `protocol`      - the listener protocol (such as tcp/udp/http/https, etc).
// * `aclType`      - the type of acl (such as white/black).
func GetAcls(ctx *pulumi.Context, args *GetAclsArgs, opts ...pulumi.InvokeOption) (*GetAclsResult, error) {
	var rv GetAclsResult
	err := ctx.Invoke("alicloud:slb/getAcls:getAcls", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAcls.
type GetAclsArgs struct {
	// A list of acls IDs to filter results.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by acl name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The Id of resource group which acl belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

// A collection of values returned by getAcls.
type GetAclsResult struct {
	// A list of SLB  acls. Each element contains the following attributes:
	Acls []GetAclsAcl `pulumi:"acls"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of SLB acls IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of SLB acls names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// Resource group ID.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

func GetAclsOutput(ctx *pulumi.Context, args GetAclsOutputArgs, opts ...pulumi.InvokeOption) GetAclsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAclsResult, error) {
			args := v.(GetAclsArgs)
			r, err := GetAcls(ctx, &args, opts...)
			var s GetAclsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAclsResultOutput)
}

// A collection of arguments for invoking getAcls.
type GetAclsOutputArgs struct {
	// A list of acls IDs to filter results.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by acl name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The Id of resource group which acl belongs.
	ResourceGroupId pulumi.StringPtrInput `pulumi:"resourceGroupId"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput `pulumi:"tags"`
}

func (GetAclsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAclsArgs)(nil)).Elem()
}

// A collection of values returned by getAcls.
type GetAclsResultOutput struct{ *pulumi.OutputState }

func (GetAclsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAclsResult)(nil)).Elem()
}

func (o GetAclsResultOutput) ToGetAclsResultOutput() GetAclsResultOutput {
	return o
}

func (o GetAclsResultOutput) ToGetAclsResultOutputWithContext(ctx context.Context) GetAclsResultOutput {
	return o
}

// A list of SLB  acls. Each element contains the following attributes:
func (o GetAclsResultOutput) Acls() GetAclsAclArrayOutput {
	return o.ApplyT(func(v GetAclsResult) []GetAclsAcl { return v.Acls }).(GetAclsAclArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAclsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAclsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of SLB acls IDs.
func (o GetAclsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAclsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetAclsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAclsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of SLB acls names.
func (o GetAclsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAclsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetAclsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAclsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// Resource group ID.
func (o GetAclsResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAclsResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// A mapping of tags to assign to the resource.
func (o GetAclsResultOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v GetAclsResult) map[string]interface{} { return v.Tags }).(pulumi.MapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAclsResultOutput{})
}
