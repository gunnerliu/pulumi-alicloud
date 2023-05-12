// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ocean

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Ocean Base Instances of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.203.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ocean"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := ocean.GetBaseInstances(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("oceanBaseInstanceId1", ids.Instances[0].Id)
//			nameRegex, err := ocean.GetBaseInstances(ctx, &ocean.GetBaseInstancesArgs{
//				NameRegex: pulumi.StringRef("^my-Instance"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("oceanBaseInstanceId2", nameRegex.Instances[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetBaseInstances(ctx *pulumi.Context, args *GetBaseInstancesArgs, opts ...pulumi.InvokeOption) (*GetBaseInstancesResult, error) {
	var rv GetBaseInstancesResult
	err := ctx.Invoke("alicloud:ocean/getBaseInstances:getBaseInstances", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBaseInstances.
type GetBaseInstancesArgs struct {
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Instance IDs.
	Ids []string `pulumi:"ids"`
	// OceanBase cluster ID.
	InstanceId *string `pulumi:"instanceId"`
	// OceanBase cluster name.
	InstanceName *string `pulumi:"instanceName"`
	// A regex string to filter results by Instance name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
	// The ID of the enterprise resource group to which the instance resides.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The filter keyword for the query list.
	SearchKey *string `pulumi:"searchKey"`
	// The status of the resource.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getBaseInstances.
type GetBaseInstancesResult struct {
	EnableDetails *bool `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id              string                     `pulumi:"id"`
	Ids             []string                   `pulumi:"ids"`
	InstanceId      *string                    `pulumi:"instanceId"`
	InstanceName    *string                    `pulumi:"instanceName"`
	Instances       []GetBaseInstancesInstance `pulumi:"instances"`
	NameRegex       *string                    `pulumi:"nameRegex"`
	Names           []string                   `pulumi:"names"`
	OutputFile      *string                    `pulumi:"outputFile"`
	PageNumber      *int                       `pulumi:"pageNumber"`
	PageSize        *int                       `pulumi:"pageSize"`
	ResourceGroupId *string                    `pulumi:"resourceGroupId"`
	SearchKey       *string                    `pulumi:"searchKey"`
	Status          *string                    `pulumi:"status"`
}

func GetBaseInstancesOutput(ctx *pulumi.Context, args GetBaseInstancesOutputArgs, opts ...pulumi.InvokeOption) GetBaseInstancesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetBaseInstancesResult, error) {
			args := v.(GetBaseInstancesArgs)
			r, err := GetBaseInstances(ctx, &args, opts...)
			var s GetBaseInstancesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetBaseInstancesResultOutput)
}

// A collection of arguments for invoking getBaseInstances.
type GetBaseInstancesOutputArgs struct {
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Instance IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// OceanBase cluster ID.
	InstanceId pulumi.StringPtrInput `pulumi:"instanceId"`
	// OceanBase cluster name.
	InstanceName pulumi.StringPtrInput `pulumi:"instanceName"`
	// A regex string to filter results by Instance name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
	// The ID of the enterprise resource group to which the instance resides.
	ResourceGroupId pulumi.StringPtrInput `pulumi:"resourceGroupId"`
	// The filter keyword for the query list.
	SearchKey pulumi.StringPtrInput `pulumi:"searchKey"`
	// The status of the resource.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetBaseInstancesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBaseInstancesArgs)(nil)).Elem()
}

// A collection of values returned by getBaseInstances.
type GetBaseInstancesResultOutput struct{ *pulumi.OutputState }

func (GetBaseInstancesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBaseInstancesResult)(nil)).Elem()
}

func (o GetBaseInstancesResultOutput) ToGetBaseInstancesResultOutput() GetBaseInstancesResultOutput {
	return o
}

func (o GetBaseInstancesResultOutput) ToGetBaseInstancesResultOutputWithContext(ctx context.Context) GetBaseInstancesResultOutput {
	return o
}

func (o GetBaseInstancesResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetBaseInstancesResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetBaseInstancesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetBaseInstancesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetBaseInstancesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetBaseInstancesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetBaseInstancesResultOutput) InstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBaseInstancesResult) *string { return v.InstanceId }).(pulumi.StringPtrOutput)
}

func (o GetBaseInstancesResultOutput) InstanceName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBaseInstancesResult) *string { return v.InstanceName }).(pulumi.StringPtrOutput)
}

func (o GetBaseInstancesResultOutput) Instances() GetBaseInstancesInstanceArrayOutput {
	return o.ApplyT(func(v GetBaseInstancesResult) []GetBaseInstancesInstance { return v.Instances }).(GetBaseInstancesInstanceArrayOutput)
}

func (o GetBaseInstancesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBaseInstancesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetBaseInstancesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetBaseInstancesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetBaseInstancesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBaseInstancesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetBaseInstancesResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetBaseInstancesResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetBaseInstancesResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetBaseInstancesResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

func (o GetBaseInstancesResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBaseInstancesResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

func (o GetBaseInstancesResultOutput) SearchKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBaseInstancesResult) *string { return v.SearchKey }).(pulumi.StringPtrOutput)
}

func (o GetBaseInstancesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBaseInstancesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetBaseInstancesResultOutput{})
}
