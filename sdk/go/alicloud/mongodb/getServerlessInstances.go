// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Mongodb Serverless Instances of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.148.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/mongodb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := mongodb.GetServerlessInstances(ctx, &mongodb.GetServerlessInstancesArgs{
//				Ids: []string{
//					"example_value",
//				},
//				DbInstanceClass:       pulumi.StringRef("example_value"),
//				DbInstanceDescription: pulumi.StringRef("example_value"),
//				NetworkType:           pulumi.StringRef("VPC"),
//				ResourceGroupId:       pulumi.StringRef("example_value"),
//				Status:                pulumi.StringRef("Running"),
//				VpcId:                 pulumi.StringRef("example_value"),
//				VswitchId:             pulumi.StringRef("example_value"),
//				ZoneId:                pulumi.StringRef("example_value"),
//				Tags: map[string]interface{}{
//					"Created": "MongodbServerlessInstance",
//					"For":     "TF",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("mongodbServerlessInstanceId1", example.Instances[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetServerlessInstances(ctx *pulumi.Context, args *GetServerlessInstancesArgs, opts ...pulumi.InvokeOption) (*GetServerlessInstancesResult, error) {
	var rv GetServerlessInstancesResult
	err := ctx.Invoke("alicloud:mongodb/getServerlessInstances:getServerlessInstances", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServerlessInstances.
type GetServerlessInstancesArgs struct {
	// The db instance class.
	DbInstanceClass *string `pulumi:"dbInstanceClass"`
	// The db instance description.
	DbInstanceDescription *string `pulumi:"dbInstanceDescription"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Serverless Instance IDs.
	Ids []string `pulumi:"ids"`
	// The network type of the instance.
	NetworkType *string `pulumi:"networkType"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The status of the instance.
	Status *string `pulumi:"status"`
	// The tag of the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The ID of the VPC network.
	VpcId *string `pulumi:"vpcId"`
	// The id of the vswitch.
	VswitchId *string `pulumi:"vswitchId"`
	// The ID of the zone.
	ZoneId *string `pulumi:"zoneId"`
}

// A collection of values returned by getServerlessInstances.
type GetServerlessInstancesResult struct {
	DbInstanceClass       *string `pulumi:"dbInstanceClass"`
	DbInstanceDescription *string `pulumi:"dbInstanceDescription"`
	EnableDetails         *bool   `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id              string                           `pulumi:"id"`
	Ids             []string                         `pulumi:"ids"`
	Instances       []GetServerlessInstancesInstance `pulumi:"instances"`
	NetworkType     *string                          `pulumi:"networkType"`
	OutputFile      *string                          `pulumi:"outputFile"`
	ResourceGroupId *string                          `pulumi:"resourceGroupId"`
	Status          *string                          `pulumi:"status"`
	Tags            map[string]interface{}           `pulumi:"tags"`
	VpcId           *string                          `pulumi:"vpcId"`
	VswitchId       *string                          `pulumi:"vswitchId"`
	ZoneId          *string                          `pulumi:"zoneId"`
}

func GetServerlessInstancesOutput(ctx *pulumi.Context, args GetServerlessInstancesOutputArgs, opts ...pulumi.InvokeOption) GetServerlessInstancesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServerlessInstancesResult, error) {
			args := v.(GetServerlessInstancesArgs)
			r, err := GetServerlessInstances(ctx, &args, opts...)
			var s GetServerlessInstancesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetServerlessInstancesResultOutput)
}

// A collection of arguments for invoking getServerlessInstances.
type GetServerlessInstancesOutputArgs struct {
	// The db instance class.
	DbInstanceClass pulumi.StringPtrInput `pulumi:"dbInstanceClass"`
	// The db instance description.
	DbInstanceDescription pulumi.StringPtrInput `pulumi:"dbInstanceDescription"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Serverless Instance IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The network type of the instance.
	NetworkType pulumi.StringPtrInput `pulumi:"networkType"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput `pulumi:"resourceGroupId"`
	// The status of the instance.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The tag of the resource.
	Tags pulumi.MapInput `pulumi:"tags"`
	// The ID of the VPC network.
	VpcId pulumi.StringPtrInput `pulumi:"vpcId"`
	// The id of the vswitch.
	VswitchId pulumi.StringPtrInput `pulumi:"vswitchId"`
	// The ID of the zone.
	ZoneId pulumi.StringPtrInput `pulumi:"zoneId"`
}

func (GetServerlessInstancesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServerlessInstancesArgs)(nil)).Elem()
}

// A collection of values returned by getServerlessInstances.
type GetServerlessInstancesResultOutput struct{ *pulumi.OutputState }

func (GetServerlessInstancesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServerlessInstancesResult)(nil)).Elem()
}

func (o GetServerlessInstancesResultOutput) ToGetServerlessInstancesResultOutput() GetServerlessInstancesResultOutput {
	return o
}

func (o GetServerlessInstancesResultOutput) ToGetServerlessInstancesResultOutputWithContext(ctx context.Context) GetServerlessInstancesResultOutput {
	return o
}

func (o GetServerlessInstancesResultOutput) DbInstanceClass() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerlessInstancesResult) *string { return v.DbInstanceClass }).(pulumi.StringPtrOutput)
}

func (o GetServerlessInstancesResultOutput) DbInstanceDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerlessInstancesResult) *string { return v.DbInstanceDescription }).(pulumi.StringPtrOutput)
}

func (o GetServerlessInstancesResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetServerlessInstancesResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetServerlessInstancesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServerlessInstancesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetServerlessInstancesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetServerlessInstancesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetServerlessInstancesResultOutput) Instances() GetServerlessInstancesInstanceArrayOutput {
	return o.ApplyT(func(v GetServerlessInstancesResult) []GetServerlessInstancesInstance { return v.Instances }).(GetServerlessInstancesInstanceArrayOutput)
}

func (o GetServerlessInstancesResultOutput) NetworkType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerlessInstancesResult) *string { return v.NetworkType }).(pulumi.StringPtrOutput)
}

func (o GetServerlessInstancesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerlessInstancesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetServerlessInstancesResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerlessInstancesResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

func (o GetServerlessInstancesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerlessInstancesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetServerlessInstancesResultOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v GetServerlessInstancesResult) map[string]interface{} { return v.Tags }).(pulumi.MapOutput)
}

func (o GetServerlessInstancesResultOutput) VpcId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerlessInstancesResult) *string { return v.VpcId }).(pulumi.StringPtrOutput)
}

func (o GetServerlessInstancesResultOutput) VswitchId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerlessInstancesResult) *string { return v.VswitchId }).(pulumi.StringPtrOutput)
}

func (o GetServerlessInstancesResultOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServerlessInstancesResult) *string { return v.ZoneId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServerlessInstancesResultOutput{})
}
