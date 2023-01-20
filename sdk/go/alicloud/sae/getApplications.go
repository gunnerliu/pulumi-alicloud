// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sae

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Sae Applications of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.161.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/sae"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf-testacc"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			vpc, err := vpc.NewNetwork(ctx, "vpc", &vpc.NetworkArgs{
//				VpcName:   pulumi.String("tf_testacc"),
//				CidrBlock: pulumi.String("172.16.0.0/12"),
//			})
//			if err != nil {
//				return err
//			}
//			vsw, err := vpc.NewSwitch(ctx, "vsw", &vpc.SwitchArgs{
//				VpcId:       vpc.ID(),
//				CidrBlock:   pulumi.String("172.16.0.0/24"),
//				ZoneId:      *pulumi.String(defaultZones.Zones[0].Id),
//				VswitchName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			defaultNamespace, err := sae.NewNamespace(ctx, "defaultNamespace", &sae.NamespaceArgs{
//				NamespaceDescription: pulumi.String(name),
//				NamespaceId:          pulumi.String("cn-hangzhou:tfacctest"),
//				NamespaceName:        pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			defaultApplication, err := sae.NewApplication(ctx, "defaultApplication", &sae.ApplicationArgs{
//				AppDescription: pulumi.String("tf-testaccDescription"),
//				AppName:        pulumi.String("tf-testaccAppName131"),
//				NamespaceId:    defaultNamespace.ID(),
//				ImageUrl:       pulumi.String("registry-vpc.cn-hangzhou.aliyuncs.com/lxepoo/apache-php5"),
//				PackageType:    pulumi.String("Image"),
//				VswitchId:      vsw.ID(),
//				Timezone:       pulumi.String("Asia/Beijing"),
//				Replicas:       pulumi.Int(5),
//				Cpu:            pulumi.Int(500),
//				Memory:         pulumi.Int(2048),
//			})
//			if err != nil {
//				return err
//			}
//			defaultApplications := sae.GetApplicationsOutput(ctx, sae.GetApplicationsOutputArgs{
//				Ids: pulumi.StringArray{
//					defaultApplication.ID(),
//				},
//			}, nil)
//			ctx.Export("saeApplicationId", defaultApplications.ApplyT(func(defaultApplications sae.GetApplicationsResult) (*string, error) {
//				return &defaultApplications.Applications[0].Id, nil
//			}).(pulumi.StringPtrOutput))
//			return nil
//		})
//	}
//
// ```
func GetApplications(ctx *pulumi.Context, args *GetApplicationsArgs, opts ...pulumi.InvokeOption) (*GetApplicationsResult, error) {
	var rv GetApplicationsResult
	err := ctx.Invoke("alicloud:sae/getApplications:getApplications", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApplications.
type GetApplicationsArgs struct {
	// Application Name. Combinations of numbers, letters, and dashes (-) are allowed. It must start with a letter and the maximum length is 36 characters.
	AppName *string `pulumi:"appName"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// The field type. Valid values:`appName`, `appIds`, `slbIps`, `instanceIps`
	FieldType *string `pulumi:"fieldType"`
	// The field value.
	FieldValue *string `pulumi:"fieldValue"`
	// A list of Application IDs.
	Ids []string `pulumi:"ids"`
	// SAE namespace ID. Only namespaces whose names are lowercase letters and dashes (-) are supported, and must start with a letter. The namespace can be obtained by calling the DescribeNamespaceList interface.
	NamespaceId *string `pulumi:"namespaceId"`
	// The order by.Valid values:`running`,`instances`.
	OrderBy    *string `pulumi:"orderBy"`
	OutputFile *string `pulumi:"outputFile"`
	// The reverse.
	Reverse *bool `pulumi:"reverse"`
	// The status of the resource.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getApplications.
type GetApplicationsResult struct {
	AppName       *string                      `pulumi:"appName"`
	Applications  []GetApplicationsApplication `pulumi:"applications"`
	EnableDetails *bool                        `pulumi:"enableDetails"`
	FieldType     *string                      `pulumi:"fieldType"`
	FieldValue    *string                      `pulumi:"fieldValue"`
	// The provider-assigned unique ID for this managed resource.
	Id          string   `pulumi:"id"`
	Ids         []string `pulumi:"ids"`
	NamespaceId *string  `pulumi:"namespaceId"`
	OrderBy     *string  `pulumi:"orderBy"`
	OutputFile  *string  `pulumi:"outputFile"`
	Reverse     *bool    `pulumi:"reverse"`
	Status      *string  `pulumi:"status"`
}

func GetApplicationsOutput(ctx *pulumi.Context, args GetApplicationsOutputArgs, opts ...pulumi.InvokeOption) GetApplicationsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetApplicationsResult, error) {
			args := v.(GetApplicationsArgs)
			r, err := GetApplications(ctx, &args, opts...)
			var s GetApplicationsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetApplicationsResultOutput)
}

// A collection of arguments for invoking getApplications.
type GetApplicationsOutputArgs struct {
	// Application Name. Combinations of numbers, letters, and dashes (-) are allowed. It must start with a letter and the maximum length is 36 characters.
	AppName pulumi.StringPtrInput `pulumi:"appName"`
	// Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// The field type. Valid values:`appName`, `appIds`, `slbIps`, `instanceIps`
	FieldType pulumi.StringPtrInput `pulumi:"fieldType"`
	// The field value.
	FieldValue pulumi.StringPtrInput `pulumi:"fieldValue"`
	// A list of Application IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// SAE namespace ID. Only namespaces whose names are lowercase letters and dashes (-) are supported, and must start with a letter. The namespace can be obtained by calling the DescribeNamespaceList interface.
	NamespaceId pulumi.StringPtrInput `pulumi:"namespaceId"`
	// The order by.Valid values:`running`,`instances`.
	OrderBy    pulumi.StringPtrInput `pulumi:"orderBy"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The reverse.
	Reverse pulumi.BoolPtrInput `pulumi:"reverse"`
	// The status of the resource.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetApplicationsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetApplicationsArgs)(nil)).Elem()
}

// A collection of values returned by getApplications.
type GetApplicationsResultOutput struct{ *pulumi.OutputState }

func (GetApplicationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetApplicationsResult)(nil)).Elem()
}

func (o GetApplicationsResultOutput) ToGetApplicationsResultOutput() GetApplicationsResultOutput {
	return o
}

func (o GetApplicationsResultOutput) ToGetApplicationsResultOutputWithContext(ctx context.Context) GetApplicationsResultOutput {
	return o
}

func (o GetApplicationsResultOutput) AppName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApplicationsResult) *string { return v.AppName }).(pulumi.StringPtrOutput)
}

func (o GetApplicationsResultOutput) Applications() GetApplicationsApplicationArrayOutput {
	return o.ApplyT(func(v GetApplicationsResult) []GetApplicationsApplication { return v.Applications }).(GetApplicationsApplicationArrayOutput)
}

func (o GetApplicationsResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetApplicationsResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

func (o GetApplicationsResultOutput) FieldType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApplicationsResult) *string { return v.FieldType }).(pulumi.StringPtrOutput)
}

func (o GetApplicationsResultOutput) FieldValue() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApplicationsResult) *string { return v.FieldValue }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetApplicationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetApplicationsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetApplicationsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetApplicationsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetApplicationsResultOutput) NamespaceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApplicationsResult) *string { return v.NamespaceId }).(pulumi.StringPtrOutput)
}

func (o GetApplicationsResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApplicationsResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

func (o GetApplicationsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApplicationsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetApplicationsResultOutput) Reverse() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetApplicationsResult) *bool { return v.Reverse }).(pulumi.BoolPtrOutput)
}

func (o GetApplicationsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetApplicationsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetApplicationsResultOutput{})
}
