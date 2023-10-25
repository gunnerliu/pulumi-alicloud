// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dms

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides a list of DMS Enterprise Instances in an Alibaba Cloud account according to the specified filters.
//
// > **NOTE:** Available in 1.88.0+
func GetEnterpriseInstances(ctx *pulumi.Context, args *GetEnterpriseInstancesArgs, opts ...pulumi.InvokeOption) (*GetEnterpriseInstancesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetEnterpriseInstancesResult
	err := ctx.Invoke("alicloud:dms/getEnterpriseInstances:getEnterpriseInstances", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEnterpriseInstances.
type GetEnterpriseInstancesArgs struct {
	// The type of the environment to which the database instance belongs.
	EnvType *string `pulumi:"envType"`
	// A regex string to filter the results by the DMS Enterprise Instance instance_alias.
	InstanceAliasRegex *string `pulumi:"instanceAliasRegex"`
	// The source of the database instance.
	InstanceSource *string `pulumi:"instanceSource"`
	// The ID of the database instance.
	InstanceType *string `pulumi:"instanceType"`
	// A regex string to filter the results by the DMS Enterprise Instance instance_alias.
	NameRegex *string `pulumi:"nameRegex"`
	// The network type of the database instance. Valid values: CLASSIC and VPC. For more information about the valid values, see the description of the RegisterInstance operation.
	NetType *string `pulumi:"netType"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The keyword used to query database instances.
	SearchKey *string `pulumi:"searchKey"`
	// Filter the results by status of the DMS Enterprise Instances. Valid values: `NORMAL`, `UNAVAILABLE`, `UNKNOWN`, `DELETED`, `DISABLE`.
	Status *string `pulumi:"status"`
	// The ID of the tenant in Data Management (DMS) Enterprise.
	Tid *int `pulumi:"tid"`
}

// A collection of values returned by getEnterpriseInstances.
type GetEnterpriseInstancesResult struct {
	// The type of the environment to which the database instance belongs..
	EnvType *string `pulumi:"envType"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of DMS Enterprise IDs (Each of them consists of host:port).
	Ids                []string `pulumi:"ids"`
	InstanceAliasRegex *string  `pulumi:"instanceAliasRegex"`
	// The ID of the database instance.
	InstanceSource *string `pulumi:"instanceSource"`
	// The ID of the database instance.
	InstanceType *string `pulumi:"instanceType"`
	// A list of KMS keys. Each element contains the following attributes:
	Instances []GetEnterpriseInstancesInstance `pulumi:"instances"`
	NameRegex *string                          `pulumi:"nameRegex"`
	// A list of DMS Enterprise names.
	Names      []string `pulumi:"names"`
	NetType    *string  `pulumi:"netType"`
	OutputFile *string  `pulumi:"outputFile"`
	SearchKey  *string  `pulumi:"searchKey"`
	// The status of the database instance.
	Status *string `pulumi:"status"`
	Tid    *int    `pulumi:"tid"`
}

func GetEnterpriseInstancesOutput(ctx *pulumi.Context, args GetEnterpriseInstancesOutputArgs, opts ...pulumi.InvokeOption) GetEnterpriseInstancesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetEnterpriseInstancesResult, error) {
			args := v.(GetEnterpriseInstancesArgs)
			r, err := GetEnterpriseInstances(ctx, &args, opts...)
			var s GetEnterpriseInstancesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetEnterpriseInstancesResultOutput)
}

// A collection of arguments for invoking getEnterpriseInstances.
type GetEnterpriseInstancesOutputArgs struct {
	// The type of the environment to which the database instance belongs.
	EnvType pulumi.StringPtrInput `pulumi:"envType"`
	// A regex string to filter the results by the DMS Enterprise Instance instance_alias.
	InstanceAliasRegex pulumi.StringPtrInput `pulumi:"instanceAliasRegex"`
	// The source of the database instance.
	InstanceSource pulumi.StringPtrInput `pulumi:"instanceSource"`
	// The ID of the database instance.
	InstanceType pulumi.StringPtrInput `pulumi:"instanceType"`
	// A regex string to filter the results by the DMS Enterprise Instance instance_alias.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// The network type of the database instance. Valid values: CLASSIC and VPC. For more information about the valid values, see the description of the RegisterInstance operation.
	NetType pulumi.StringPtrInput `pulumi:"netType"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The keyword used to query database instances.
	SearchKey pulumi.StringPtrInput `pulumi:"searchKey"`
	// Filter the results by status of the DMS Enterprise Instances. Valid values: `NORMAL`, `UNAVAILABLE`, `UNKNOWN`, `DELETED`, `DISABLE`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The ID of the tenant in Data Management (DMS) Enterprise.
	Tid pulumi.IntPtrInput `pulumi:"tid"`
}

func (GetEnterpriseInstancesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEnterpriseInstancesArgs)(nil)).Elem()
}

// A collection of values returned by getEnterpriseInstances.
type GetEnterpriseInstancesResultOutput struct{ *pulumi.OutputState }

func (GetEnterpriseInstancesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEnterpriseInstancesResult)(nil)).Elem()
}

func (o GetEnterpriseInstancesResultOutput) ToGetEnterpriseInstancesResultOutput() GetEnterpriseInstancesResultOutput {
	return o
}

func (o GetEnterpriseInstancesResultOutput) ToGetEnterpriseInstancesResultOutputWithContext(ctx context.Context) GetEnterpriseInstancesResultOutput {
	return o
}

func (o GetEnterpriseInstancesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetEnterpriseInstancesResult] {
	return pulumix.Output[GetEnterpriseInstancesResult]{
		OutputState: o.OutputState,
	}
}

// The type of the environment to which the database instance belongs..
func (o GetEnterpriseInstancesResultOutput) EnvType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEnterpriseInstancesResult) *string { return v.EnvType }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEnterpriseInstancesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEnterpriseInstancesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of DMS Enterprise IDs (Each of them consists of host:port).
func (o GetEnterpriseInstancesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEnterpriseInstancesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetEnterpriseInstancesResultOutput) InstanceAliasRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEnterpriseInstancesResult) *string { return v.InstanceAliasRegex }).(pulumi.StringPtrOutput)
}

// The ID of the database instance.
func (o GetEnterpriseInstancesResultOutput) InstanceSource() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEnterpriseInstancesResult) *string { return v.InstanceSource }).(pulumi.StringPtrOutput)
}

// The ID of the database instance.
func (o GetEnterpriseInstancesResultOutput) InstanceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEnterpriseInstancesResult) *string { return v.InstanceType }).(pulumi.StringPtrOutput)
}

// A list of KMS keys. Each element contains the following attributes:
func (o GetEnterpriseInstancesResultOutput) Instances() GetEnterpriseInstancesInstanceArrayOutput {
	return o.ApplyT(func(v GetEnterpriseInstancesResult) []GetEnterpriseInstancesInstance { return v.Instances }).(GetEnterpriseInstancesInstanceArrayOutput)
}

func (o GetEnterpriseInstancesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEnterpriseInstancesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of DMS Enterprise names.
func (o GetEnterpriseInstancesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEnterpriseInstancesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetEnterpriseInstancesResultOutput) NetType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEnterpriseInstancesResult) *string { return v.NetType }).(pulumi.StringPtrOutput)
}

func (o GetEnterpriseInstancesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEnterpriseInstancesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetEnterpriseInstancesResultOutput) SearchKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEnterpriseInstancesResult) *string { return v.SearchKey }).(pulumi.StringPtrOutput)
}

// The status of the database instance.
func (o GetEnterpriseInstancesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEnterpriseInstancesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetEnterpriseInstancesResultOutput) Tid() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetEnterpriseInstancesResult) *int { return v.Tid }).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEnterpriseInstancesResultOutput{})
}
