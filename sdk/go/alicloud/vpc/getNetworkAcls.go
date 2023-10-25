// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Network Acls of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.122.0+.
func GetNetworkAcls(ctx *pulumi.Context, args *GetNetworkAclsArgs, opts ...pulumi.InvokeOption) (*GetNetworkAclsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNetworkAclsResult
	err := ctx.Invoke("alicloud:vpc/getNetworkAcls:getNetworkAcls", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworkAcls.
type GetNetworkAclsArgs struct {
	// A list of Network Acl ID.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Network Acl name.
	NameRegex *string `pulumi:"nameRegex"`
	// The name of the network ACL.
	NetworkAclName *string `pulumi:"networkAclName"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the associated resource.
	ResourceId *string `pulumi:"resourceId"`
	// The type of the associated resource.
	ResourceType *string `pulumi:"resourceType"`
	// The state of the network ACL.
	Status *string `pulumi:"status"`
	// The ID of the associated VPC.
	VpcId *string `pulumi:"vpcId"`
}

// A collection of values returned by getNetworkAcls.
type GetNetworkAclsResult struct {
	Acls []GetNetworkAclsAcl `pulumi:"acls"`
	// The provider-assigned unique ID for this managed resource.
	Id             string   `pulumi:"id"`
	Ids            []string `pulumi:"ids"`
	NameRegex      *string  `pulumi:"nameRegex"`
	Names          []string `pulumi:"names"`
	NetworkAclName *string  `pulumi:"networkAclName"`
	OutputFile     *string  `pulumi:"outputFile"`
	ResourceId     *string  `pulumi:"resourceId"`
	ResourceType   *string  `pulumi:"resourceType"`
	Status         *string  `pulumi:"status"`
	VpcId          *string  `pulumi:"vpcId"`
}

func GetNetworkAclsOutput(ctx *pulumi.Context, args GetNetworkAclsOutputArgs, opts ...pulumi.InvokeOption) GetNetworkAclsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetNetworkAclsResult, error) {
			args := v.(GetNetworkAclsArgs)
			r, err := GetNetworkAcls(ctx, &args, opts...)
			var s GetNetworkAclsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetNetworkAclsResultOutput)
}

// A collection of arguments for invoking getNetworkAcls.
type GetNetworkAclsOutputArgs struct {
	// A list of Network Acl ID.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Network Acl name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// The name of the network ACL.
	NetworkAclName pulumi.StringPtrInput `pulumi:"networkAclName"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the associated resource.
	ResourceId pulumi.StringPtrInput `pulumi:"resourceId"`
	// The type of the associated resource.
	ResourceType pulumi.StringPtrInput `pulumi:"resourceType"`
	// The state of the network ACL.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The ID of the associated VPC.
	VpcId pulumi.StringPtrInput `pulumi:"vpcId"`
}

func (GetNetworkAclsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetworkAclsArgs)(nil)).Elem()
}

// A collection of values returned by getNetworkAcls.
type GetNetworkAclsResultOutput struct{ *pulumi.OutputState }

func (GetNetworkAclsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetworkAclsResult)(nil)).Elem()
}

func (o GetNetworkAclsResultOutput) ToGetNetworkAclsResultOutput() GetNetworkAclsResultOutput {
	return o
}

func (o GetNetworkAclsResultOutput) ToGetNetworkAclsResultOutputWithContext(ctx context.Context) GetNetworkAclsResultOutput {
	return o
}

func (o GetNetworkAclsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetNetworkAclsResult] {
	return pulumix.Output[GetNetworkAclsResult]{
		OutputState: o.OutputState,
	}
}

func (o GetNetworkAclsResultOutput) Acls() GetNetworkAclsAclArrayOutput {
	return o.ApplyT(func(v GetNetworkAclsResult) []GetNetworkAclsAcl { return v.Acls }).(GetNetworkAclsAclArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetNetworkAclsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetworkAclsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetNetworkAclsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetNetworkAclsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetNetworkAclsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNetworkAclsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetNetworkAclsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetNetworkAclsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetNetworkAclsResultOutput) NetworkAclName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNetworkAclsResult) *string { return v.NetworkAclName }).(pulumi.StringPtrOutput)
}

func (o GetNetworkAclsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNetworkAclsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetNetworkAclsResultOutput) ResourceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNetworkAclsResult) *string { return v.ResourceId }).(pulumi.StringPtrOutput)
}

func (o GetNetworkAclsResultOutput) ResourceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNetworkAclsResult) *string { return v.ResourceType }).(pulumi.StringPtrOutput)
}

func (o GetNetworkAclsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNetworkAclsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetNetworkAclsResultOutput) VpcId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNetworkAclsResult) *string { return v.VpcId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNetworkAclsResultOutput{})
}
