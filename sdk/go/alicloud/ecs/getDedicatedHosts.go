// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides a list of ECS Dedicated Hosts in an Alibaba Cloud account according to the specified filters.
//
// > **NOTE:** Available in v1.91.0+.
func GetDedicatedHosts(ctx *pulumi.Context, args *GetDedicatedHostsArgs, opts ...pulumi.InvokeOption) (*GetDedicatedHostsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDedicatedHostsResult
	err := ctx.Invoke("alicloud:ecs/getDedicatedHosts:getDedicatedHosts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDedicatedHosts.
type GetDedicatedHostsArgs struct {
	// The ID of ECS Dedicated Host.
	DedicatedHostId *string `pulumi:"dedicatedHostId"`
	// The name of ECS Dedicated Host.
	DedicatedHostName *string `pulumi:"dedicatedHostName"`
	// The type of the dedicated host.
	DedicatedHostType *string `pulumi:"dedicatedHostType"`
	// A list of ECS Dedicated Host ids.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by the ECS Dedicated Host name.
	NameRegex *string `pulumi:"nameRegex"`
	// The reason why the dedicated host resource is locked.
	OperationLocks []GetDedicatedHostsOperationLock `pulumi:"operationLocks"`
	// Save the result to the file.
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the resource group to which the ECS Dedicated Host belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the ECS Dedicated Host. validate value: `Available`, `Creating`, `PermanentFailure`, `Released`, `UnderAssessment`.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The zone ID of the ECS Dedicated Host.
	ZoneId *string `pulumi:"zoneId"`
}

// A collection of values returned by getDedicatedHosts.
type GetDedicatedHostsResult struct {
	// ID of the ECS Dedicated Host.
	DedicatedHostId *string `pulumi:"dedicatedHostId"`
	// The name of the dedicated host.
	DedicatedHostName *string `pulumi:"dedicatedHostName"`
	// The type of the dedicated host.
	DedicatedHostType *string `pulumi:"dedicatedHostType"`
	// A list of ECS Dedicated Hosts. Each element contains the following attributes:
	Hosts []GetDedicatedHostsHost `pulumi:"hosts"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of ECS Dedicated Host ids.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of ECS Dedicated Host names.
	Names []string `pulumi:"names"`
	// (Available in 1.123.1+) The operation_locks. contains the following attribute:
	OperationLocks []GetDedicatedHostsOperationLock `pulumi:"operationLocks"`
	OutputFile     *string                          `pulumi:"outputFile"`
	// The ID of the resource group to which the dedicated host belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The service status of the dedicated host.
	Status *string                `pulumi:"status"`
	Tags   map[string]interface{} `pulumi:"tags"`
	ZoneId *string                `pulumi:"zoneId"`
}

func GetDedicatedHostsOutput(ctx *pulumi.Context, args GetDedicatedHostsOutputArgs, opts ...pulumi.InvokeOption) GetDedicatedHostsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDedicatedHostsResult, error) {
			args := v.(GetDedicatedHostsArgs)
			r, err := GetDedicatedHosts(ctx, &args, opts...)
			var s GetDedicatedHostsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDedicatedHostsResultOutput)
}

// A collection of arguments for invoking getDedicatedHosts.
type GetDedicatedHostsOutputArgs struct {
	// The ID of ECS Dedicated Host.
	DedicatedHostId pulumi.StringPtrInput `pulumi:"dedicatedHostId"`
	// The name of ECS Dedicated Host.
	DedicatedHostName pulumi.StringPtrInput `pulumi:"dedicatedHostName"`
	// The type of the dedicated host.
	DedicatedHostType pulumi.StringPtrInput `pulumi:"dedicatedHostType"`
	// A list of ECS Dedicated Host ids.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by the ECS Dedicated Host name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// The reason why the dedicated host resource is locked.
	OperationLocks GetDedicatedHostsOperationLockArrayInput `pulumi:"operationLocks"`
	// Save the result to the file.
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the resource group to which the ECS Dedicated Host belongs.
	ResourceGroupId pulumi.StringPtrInput `pulumi:"resourceGroupId"`
	// The status of the ECS Dedicated Host. validate value: `Available`, `Creating`, `PermanentFailure`, `Released`, `UnderAssessment`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput `pulumi:"tags"`
	// The zone ID of the ECS Dedicated Host.
	ZoneId pulumi.StringPtrInput `pulumi:"zoneId"`
}

func (GetDedicatedHostsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDedicatedHostsArgs)(nil)).Elem()
}

// A collection of values returned by getDedicatedHosts.
type GetDedicatedHostsResultOutput struct{ *pulumi.OutputState }

func (GetDedicatedHostsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDedicatedHostsResult)(nil)).Elem()
}

func (o GetDedicatedHostsResultOutput) ToGetDedicatedHostsResultOutput() GetDedicatedHostsResultOutput {
	return o
}

func (o GetDedicatedHostsResultOutput) ToGetDedicatedHostsResultOutputWithContext(ctx context.Context) GetDedicatedHostsResultOutput {
	return o
}

func (o GetDedicatedHostsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetDedicatedHostsResult] {
	return pulumix.Output[GetDedicatedHostsResult]{
		OutputState: o.OutputState,
	}
}

// ID of the ECS Dedicated Host.
func (o GetDedicatedHostsResultOutput) DedicatedHostId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDedicatedHostsResult) *string { return v.DedicatedHostId }).(pulumi.StringPtrOutput)
}

// The name of the dedicated host.
func (o GetDedicatedHostsResultOutput) DedicatedHostName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDedicatedHostsResult) *string { return v.DedicatedHostName }).(pulumi.StringPtrOutput)
}

// The type of the dedicated host.
func (o GetDedicatedHostsResultOutput) DedicatedHostType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDedicatedHostsResult) *string { return v.DedicatedHostType }).(pulumi.StringPtrOutput)
}

// A list of ECS Dedicated Hosts. Each element contains the following attributes:
func (o GetDedicatedHostsResultOutput) Hosts() GetDedicatedHostsHostArrayOutput {
	return o.ApplyT(func(v GetDedicatedHostsResult) []GetDedicatedHostsHost { return v.Hosts }).(GetDedicatedHostsHostArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDedicatedHostsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDedicatedHostsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of ECS Dedicated Host ids.
func (o GetDedicatedHostsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDedicatedHostsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetDedicatedHostsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDedicatedHostsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of ECS Dedicated Host names.
func (o GetDedicatedHostsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDedicatedHostsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

// (Available in 1.123.1+) The operation_locks. contains the following attribute:
func (o GetDedicatedHostsResultOutput) OperationLocks() GetDedicatedHostsOperationLockArrayOutput {
	return o.ApplyT(func(v GetDedicatedHostsResult) []GetDedicatedHostsOperationLock { return v.OperationLocks }).(GetDedicatedHostsOperationLockArrayOutput)
}

func (o GetDedicatedHostsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDedicatedHostsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The ID of the resource group to which the dedicated host belongs.
func (o GetDedicatedHostsResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDedicatedHostsResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// The service status of the dedicated host.
func (o GetDedicatedHostsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDedicatedHostsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetDedicatedHostsResultOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v GetDedicatedHostsResult) map[string]interface{} { return v.Tags }).(pulumi.MapOutput)
}

func (o GetDedicatedHostsResultOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDedicatedHostsResult) *string { return v.ZoneId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDedicatedHostsResultOutput{})
}
