package org.tempuri;

public class IWidgetsProxy implements org.tempuri.IWidgets {
  private String _endpoint = null;
  private org.tempuri.IWidgets iWidgets = null;
  
  public IWidgetsProxy() {
    _initIWidgetsProxy();
  }
  
  public IWidgetsProxy(String endpoint) {
    _endpoint = endpoint;
    _initIWidgetsProxy();
  }
  
  private void _initIWidgetsProxy() {
    try {
      iWidgets = (new org.tempuri.WidgetsLocator()).getBasicHttpBinding_IWidgets();
      if (iWidgets != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iWidgets)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iWidgets)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iWidgets != null)
      ((javax.xml.rpc.Stub)iWidgets)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IWidgets getIWidgets() {
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets;
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType deleteTrustedUser(java.lang.String sessionID, java.lang.Integer trustedUserID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.deleteTrustedUser(sessionID, trustedUserID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType sendInviteTrustedUser(java.lang.String sessionID, java.lang.Integer trustedUserID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.sendInviteTrustedUser(sessionID, trustedUserID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentSharingTrustedUserjJIl8QZi inviteTrustedUser(java.lang.String sessionID, java.lang.String firstName, java.lang.String lastName, java.lang.String email) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.inviteTrustedUser(sessionID, firstName, lastName, email);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentsSharingInfowJCT_PyJf getDocumentSharingInfo(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentSharingInfo(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentsSharingInfowJCT_PyJf getDocumentsSharingInfo(java.lang.String sessionID, java.lang.String[] documentGuids) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentsSharingInfo(sessionID, documentGuids);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType setPermissionsForUser(java.lang.String sessionID, java.lang.String[] documentGuids, java.lang.Integer userID, java.lang.Integer securityLevel) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.setPermissionsForUser(sessionID, documentGuids, userID, securityLevel);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType shareDocument(java.lang.String sessionID, java.lang.Integer securityLevel, java.lang.Boolean sendEmail, java.util.Calendar expirationDate, int[] userIDs, java.lang.String[] documentGuids, java.lang.String message) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.shareDocument(sessionID, securityLevel, sendEmail, expirationDate, userIDs, documentGuids, message);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType removeSharedDocumentRights(java.lang.String sessionID, java.lang.String[] documentGuids, java.lang.Integer userID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.removeSharedDocumentRights(sessionID, documentGuids, userID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfstring isEnoughSpaceToUploadFile(java.lang.Integer applicationID, java.lang.String sessionId, java.lang.Long fileSize, java.lang.String fileExtension) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.isEnoughSpaceToUploadFile(applicationID, sessionId, fileSize, fileExtension);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfBucketQuotaInfo52SKXdDF getBucketQuotaInfo(java.lang.Integer applicationID, java.lang.String sessionID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getBucketQuotaInfo(applicationID, sessionID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean repairAllRemovedDocuments(java.lang.String sessionID, java.lang.Integer batchID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.repairAllRemovedDocuments(sessionID, batchID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentNotewJCT_PyJf getDocumentNotes(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentNotes(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentNotewJCT_PyJf createDocumentNote(java.lang.String sessionID, java.lang.String documentGuid, java.lang.String note) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.createDocumentNote(sessionID, documentGuid, note);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDisplayDocumentInfowJCT_PyJf getDocumentPages(java.lang.String sessionID, java.lang.String documentGuid, java.lang.String revisionGuid, java.lang.Integer pageNumber) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentPages(sessionID, documentGuid, revisionGuid, pageNumber);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType burnAnnotations(java.lang.String sessionID, java.lang.String revisionGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.burnAnnotations(sessionID, revisionGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType setAnnotation(java.lang.String sessionID, java.lang.String revisionGuid, java.lang.String annID, java.lang.String data) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.setAnnotation(sessionID, revisionGuid, annID, data);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentPreviewDatawJCT_PyJf getDocumentPreviewInfo(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentPreviewInfo(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType setupBatchForDocument(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer batchTypeID, org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] values) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.setupBatchForDocument(sessionID, documentGuid, batchTypeID, values);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentBatchwJCT_PyJf getDocumentBatches(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentBatches(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfguiduHEDJ7Dj getBatchItems(java.lang.String sessionID, java.lang.Integer batchID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getBatchItems(sessionID, batchID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentBatchItemForApproval52SKXdDF getDocumentBatchItemsForApproval(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentBatchItemsForApproval(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType copyMetadataToNextBatchItem(java.lang.String sessionID, java.lang.Integer batchID, java.lang.Integer sequence) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.copyMetadataToNextBatchItem(sessionID, batchID, sequence);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentLockInformationwJCT_PyJf getDocumentLockInformation(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentLockInformation(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType lockDocument(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.lockDocument(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType removeDocumentLock(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Boolean resetDocument) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.removeDocumentLock(sessionID, documentGuid, resetDocument);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfBaseDocumentDocumentEventjJIl8QZi getWorkflowEvents(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getWorkflowEvents(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfBaseDocumentDocumentEventjJIl8QZi getWorkflowEventsCurrentRevision(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getWorkflowEventsCurrentRevision(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfBaseDocumentEventjJIl8QZi getWorkflowEvent(java.lang.String sessionID, java.lang.Integer documentEvent) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getWorkflowEvent(sessionID, documentEvent);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean isCurrentRevisionViewedByCurrentUser(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.isCurrentRevisionViewedByCurrentUser(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfint addDocumentEvent(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer documentEvent) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.addDocumentEvent(sessionID, documentGuid, documentEvent);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfguiduHEDJ7Dj getDocumentsForEventsNotArchived(java.lang.String sessionID, int[] eventIDs, java.lang.Integer applicationID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentsForEventsNotArchived(sessionID, eventIDs, applicationID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType markForArchive(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.markForArchive(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean markedForArchival(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.markedForArchival(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean archiveLatestVesionFinQloud(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer years) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.archiveLatestVesionFinQloud(sessionID, documentGuid, years);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType removeDocumentIndex(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.removeDocumentIndex(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType updateWorkflowPendingDocument(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.updateWorkflowPendingDocument(sessionID, documentGuid);
  }
  
  public void getQualityReviewReport(java.lang.String begindDate, java.lang.String endDate, java.lang.Integer timePeriod) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    iWidgets.getQualityReviewReport(begindDate, endDate, timePeriod);
  }
  
  public void getObjectLayout(java.lang.String fieldID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    iWidgets.getObjectLayout(fieldID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType updateWorkflowForDocument(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer docEventID, java.lang.String[] batchDocumentGuids) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.updateWorkflowForDocument(sessionID, documentGuid, docEventID, batchDocumentGuids);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType addTermToSearchStatistics(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.String searchTerm, org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase metadataValue) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.addTermToSearchStatistics(sessionID, applicationID, searchTerm, metadataValue);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType addFacetToSearchStatistics(java.lang.String sessionID, java.lang.Integer applicationID, org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase metadataValue) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.addFacetToSearchStatistics(sessionID, applicationID, metadataValue);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType addDocumentSelectionStatistics(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.String documentGuid, org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] metadataValues, java.lang.Boolean previewedOnly) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.addDocumentSelectionStatistics(sessionID, applicationID, documentGuid, metadataValues, previewedOnly);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfChangedDocumentwJCT_PyJf getDocumentsInProcessing(java.lang.String sessionID, java.lang.Integer applicationID, org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] metadataValues) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentsInProcessing(sessionID, applicationID, metadataValues);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfRecentDocumentsInfowJCT_PyJf getRecentDocuments(java.lang.String sessionID, java.lang.String[] documentGuids) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getRecentDocuments(sessionID, documentGuids);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentSharingTrustedUserjJIl8QZi getTrustedUsers(java.lang.String sessionID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getTrustedUsers(sessionID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentSharingTrustedUserjJIl8QZi addTrustedUser(java.lang.String sessionID, java.lang.Integer trustedUserID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.addTrustedUser(sessionID, trustedUserID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfESignDataWOI_P4YU8 getDocumentEsignInfo(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentEsignInfo(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfSecurityGroupwJCT_PyJf getSecurityGroupsByType(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer securityGroupType) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getSecurityGroupsByType(sessionID, documentGuid, securityGroupType);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfSecurityGroupDatawJCT_PyJf getSecurityGroups(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getSecurityGroups(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfSecurityGroupwJCT_PyJf getSecurityGroupByID(java.lang.String sessionID, java.lang.Integer groupID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getSecurityGroupByID(sessionID, groupID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfSecurityGroupwJCT_PyJf createSecurityGroup(java.lang.String sessionID, java.lang.String name, java.lang.String description, java.lang.Integer type, java.lang.Integer ownerID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.createSecurityGroup(sessionID, name, description, type, ownerID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType removeSecurityGroup(java.lang.String sessionID, java.lang.Integer securityGroupID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.removeSecurityGroup(sessionID, securityGroupID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfUserDatawJCT_PyJf getUsersForGroup(java.lang.String sessionID, java.lang.Integer groupID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getUsersForGroup(sessionID, groupID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfSecurityGroupwJCT_PyJf getUserSecurityGroups(java.lang.String sessionID, java.lang.Integer userID, java.lang.Boolean isOwner, java.lang.Integer securityGroupType) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getUserSecurityGroups(sessionID, userID, isOwner, securityGroupType);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfUserDatawJCT_PyJf addUserToSecurityGroup(java.lang.String sessionID, java.lang.Integer groupID, java.lang.Integer userID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.addUserToSecurityGroup(sessionID, groupID, userID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType removeUserFromSecurityGroup(java.lang.String sessionID, java.lang.Integer groupID, java.lang.Integer userID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.removeUserFromSecurityGroup(sessionID, groupID, userID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfUserDatawJCT_PyJf searchUsers(java.lang.String sessionID, java.lang.String searchTerm) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.searchUsers(sessionID, searchTerm);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfUserDatawJCT_PyJf getUserDataByEmail(java.lang.String sessionID, java.lang.String email) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getUserDataByEmail(sessionID, email);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfSecurityGroupwJCT_PyJf searchSecurityGroup(java.lang.String sessionID, java.lang.String searchTerm) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.searchSecurityGroup(sessionID, searchTerm);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfSecurityGroupwJCT_PyJf searchSecurityGroupNotAdded(java.lang.String sessionID, java.lang.String searchTerm, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.searchSecurityGroupNotAdded(sessionID, searchTerm, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType removeSecurityGroupFromDocument(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer securityGroupID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.removeSecurityGroupFromDocument(sessionID, documentGuid, securityGroupID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfSecurityGroupTypewJCT_PyJf getSecurityGroupTypes(java.lang.String sessionID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getSecurityGroupTypes(sessionID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType removeAllSecurityGroupsFromDocument(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.removeAllSecurityGroupsFromDocument(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType attachSecurityGroupsToDocument(java.lang.String sessionID, java.lang.String documentGuid, int[] securityGroupIDs, java.lang.Integer securityLevel) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.attachSecurityGroupsToDocument(sessionID, documentGuid, securityGroupIDs, securityLevel);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfint getPermissionsForCurrentUser(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getPermissionsForCurrentUser(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfNullableOfint5F2DSckg getBatchIDForCriteria(java.lang.String sessionID, org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] valsToSearch, org.datacontract.schemas._2004._07.CDSImaging.ImagingBatchBatchTypes batchType) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getBatchIDForCriteria(sessionID, valsToSearch, batchType);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType markRequiredDocumentsComplete(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer batchID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.markRequiredDocumentsComplete(sessionID, documentGuid, batchID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean userCanEditMetadata(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.userCanEditMetadata(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentRevisionwJCT_PyJf getDocumentRevisions(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentRevisions(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentRevision addDocumentRevision(byte[] inputStream) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.addDocumentRevision(inputStream);
  }
  
  public java.lang.String addExternalDocumentRevision(java.lang.String parentDocGuid, java.lang.Long fileSize, java.util.Calendar revisionDate, java.lang.Integer uploadedBy, java.lang.String fileType, java.lang.String sha1Hash, java.lang.String versionID, java.lang.Integer appID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.addExternalDocumentRevision(parentDocGuid, fileSize, revisionDate, uploadedBy, fileType, sha1Hash, versionID, appID);
  }
  
  public byte[] downloadDocumentRevision(java.lang.String sessionID, java.lang.String documentGuid, java.lang.String revisionGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.downloadDocumentRevision(sessionID, documentGuid, revisionGuid);
  }
  
  public byte[] getDocumentHTML(java.lang.String sessionID, java.lang.String documentGuid, java.lang.String revisionGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentHTML(sessionID, documentGuid, revisionGuid);
  }
  
  public byte[] downloadDocumentHeadRevision(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.downloadDocumentHeadRevision(sessionID, documentGuid);
  }
  
  public byte[] getDocumentsArchive(java.lang.String sessionID, java.lang.String documentGuids) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentsArchive(sessionID, documentGuids);
  }
  
  public byte[] getAllUserDocumentsArchive(java.lang.String sessionID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getAllUserDocumentsArchive(sessionID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfguiduHEDJ7Dj getLackDeletePermissionDocuments(java.lang.String sessionID, java.lang.String[] documentGuids) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getLackDeletePermissionDocuments(sessionID, documentGuids);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean removeDocument(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.removeDocument(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType removeDocuments(java.lang.String sessionID, java.lang.String[] documentGuids) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.removeDocuments(sessionID, documentGuids);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean deleteDocumentsPermamently(java.lang.String sessionID, java.lang.String[] documentIDs) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.deleteDocumentsPermamently(sessionID, documentIDs);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfint removeAllDocuments(java.lang.String sessionID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.removeAllDocuments(sessionID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean repairRemovedDocuments(java.lang.String sessionID, java.lang.String[] documentGuids) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.repairRemovedDocuments(sessionID, documentGuids);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentFieldwJCT_PyJf getAllowedFieldsForDocument(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getAllowedFieldsForDocument(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentFieldwJCT_PyJf getAvailableFields(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getAvailableFields(sessionID, applicationID, templateID, typeID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentFieldwJCT_PyJf getDocumentRequiredFields(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentRequiredFields(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfint addDocumentField(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer fieldID, java.lang.String fieldValue) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.addDocumentField(sessionID, documentGuid, fieldID, fieldValue);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType removeDocumentField(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer valueID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.removeDocumentField(sessionID, documentGuid, valueID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType removeDocumentFieldByValue(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer fieldTypeID, java.lang.String fieldValue) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.removeDocumentFieldByValue(sessionID, documentGuid, fieldTypeID, fieldValue);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentTagwJCT_PyJf getDocumentTags(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentTags(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentTagwJCT_PyJf getUserTags(java.lang.String sessionID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getUserTags(sessionID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentTagwJCT_PyJf addDocumentTag(java.lang.String sessionID, java.lang.String documentGuid, java.lang.String tagName) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.addDocumentTag(sessionID, documentGuid, tagName);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean addTagsToDocuments(java.lang.String sessionID, java.lang.String[] tagNames, java.lang.String[] documentGuids) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.addTagsToDocuments(sessionID, tagNames, documentGuids);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType removeDocumentTag(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer tagID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.removeDocumentTag(sessionID, documentGuid, tagID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType removeDocumentTagByName(java.lang.String sessionID, java.lang.String documentGuid, java.lang.String tagName) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.removeDocumentTagByName(sessionID, documentGuid, tagName);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfBaseDocumentMetadataHierarchyElementjJIl8QZi getDocumentMetadataHierarchy(java.lang.String sessionID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentMetadataHierarchy(sessionID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfguiduHEDJ7Dj addMetadataHierarchyNode(java.lang.String sessionID, org.datacontract.schemas._2004._07.CDSImaging.BaseDocumentMetadataHierarchyElement[] elems) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.addMetadataHierarchyNode(sessionID, elems);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean moveMetadataHierarchyNode(java.lang.String sessionID, java.lang.String nodeID, java.lang.String parentNodeID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.moveMetadataHierarchyNode(sessionID, nodeID, parentNodeID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType removeMetadataHierarchyNode(java.lang.String sessionID, java.lang.String nodeID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.removeMetadataHierarchyNode(sessionID, nodeID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfboolean renameMetadataHierarchyNode(java.lang.String sessionID, java.lang.String nodeID, java.lang.String newValue) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.renameMetadataHierarchyNode(sessionID, nodeID, newValue);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentFieldTypewJCT_PyJf getAvailableFieldTypesForDocumentType(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getAvailableFieldTypesForDocumentType(sessionID, applicationID, templateID, typeID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentFieldwJCT_PyJf addFieldToDocumentType(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID, org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentFieldType fieldType) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.addFieldToDocumentType(sessionID, applicationID, templateID, typeID, fieldType);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType removeFieldFromDocumentType(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID, java.lang.Integer fieldID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.removeFieldFromDocumentType(sessionID, applicationID, templateID, typeID, fieldID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentFieldTypewJCT_PyJf getAllFieldTypes(java.lang.String sessionID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getAllFieldTypes(sessionID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfstring searchDocumentMetadata(java.lang.String sessionID, java.lang.String searchTerm, java.lang.Boolean searchTagsOnly, org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] requiredValues, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID, java.lang.Boolean shared) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.searchDocumentMetadata(sessionID, searchTerm, searchTagsOnly, requiredValues, applicationID, templateID, typeID, shared);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfstring getFacetSearchSuggest(java.lang.String sessionID, org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] requiredValues, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID, java.lang.String searchTerm, java.lang.Boolean shared) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getFacetSearchSuggest(sessionID, requiredValues, applicationID, templateID, typeID, searchTerm, shared);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfstring searchFacetValues(java.lang.String sessionID, org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] requiredValues, java.lang.String searchTerm, java.lang.String commonSearchTerm, java.lang.Integer fieldTypeID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.searchFacetValues(sessionID, requiredValues, searchTerm, commonSearchTerm, fieldTypeID, applicationID, templateID, typeID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfSearcheableMetadataTypewJCT_PyJf getAllSearcheableFields(java.lang.String sessionID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getAllSearcheableFields(sessionID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentMetadataValuewJCT_PyJf getUserDefinedMetadata(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getUserDefinedMetadata(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType setMetadataValues(java.lang.String sessionID, java.lang.String documentGuid, org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] documentMetadata, int[] removeRecordIDs) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.setMetadataValues(sessionID, documentGuid, documentMetadata, removeRecordIDs);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf getIntegratedMetadata(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getIntegratedMetadata(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentFieldwJCT_PyJf getIntegratedFieldTypesForDocument(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getIntegratedFieldTypesForDocument(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentFieldDetailedwJCT_PyJf getAllAvailableDocumentFieldTypesDetailed(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getAllAvailableDocumentFieldTypesDetailed(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfguiduHEDJ7Dj getDocumentsByMetadataValue(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer documentTypeID, java.lang.Integer fieldType, java.lang.String fieldValue, java.lang.Integer limit, int[] requiredEvents) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentsByMetadataValue(sessionID, applicationID, documentTypeID, fieldType, fieldValue, limit, requiredEvents);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf getMetadataValuesForFieldType(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer fieldTypeID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getMetadataValuesForFieldType(sessionID, documentGuid, fieldTypeID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentTemplatewJCT_PyJf getTemplatesByMetadata(java.lang.String sessionID, org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] metadataValues, java.lang.Integer applicationID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getTemplatesByMetadata(sessionID, metadataValues, applicationID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentTypewJCT_PyJf getDocumentTypesByMetadata(java.lang.String sessionID, org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] metadataValues, java.lang.Integer applicationID, java.lang.Integer templateID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentTypesByMetadata(sessionID, metadataValues, applicationID, templateID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfApplicationTypewJCT_PyJf getApplications(java.lang.String sessionID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getApplications(sessionID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDefaultTemplateTypewJCT_PyJf getDefaulTemplateAndDescription(java.lang.String sessionID, java.lang.Integer applicationID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDefaulTemplateAndDescription(sessionID, applicationID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentDashboardwJCT_PyJf getDashboardEvents(java.lang.String sessionID, java.lang.Integer applicationID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDashboardEvents(sessionID, applicationID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentRevisionHistorywJCT_PyJf getEventsForDocument(java.lang.String sessionID, java.lang.String documentGuid, int[] eventIds) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getEventsForDocument(sessionID, documentGuid, eventIds);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType setDefaultDescriptionForApplication(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer descriptionID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.setDefaultDescriptionForApplication(sessionID, applicationID, templateID, descriptionID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfguiduHEDJ7Dj getDocumentsForEventsByMetaValue(java.lang.String sessionID, int[] eventIDs, java.lang.Integer applicationID, java.lang.String dbValue, java.lang.Integer metaID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentsForEventsByMetaValue(sessionID, eventIDs, applicationID, dbValue, metaID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfguiduHEDJ7Dj getDocumentsForEvents(java.lang.String sessionID, int[] eventIDs, java.lang.Integer applicationID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentsForEvents(sessionID, eventIDs, applicationID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentwJCT_PyJf getListOfDocumentsByEvent(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer documentEventID, java.lang.Integer pageSize, java.lang.Integer pageNumber) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getListOfDocumentsByEvent(sessionID, applicationID, documentEventID, pageSize, pageNumber);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentwJCT_PyJf getFilterDocuments(java.lang.String sessionID, java.lang.Integer templateID, java.lang.Integer documentTypeID, java.util.Calendar fromDate, java.util.Calendar toDate, org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.FieldValue[] fieldValues, java.lang.Integer documentEventID, java.lang.Integer orderType, java.lang.Integer pageSize, java.lang.Integer applicationID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getFilterDocuments(sessionID, templateID, documentTypeID, fromDate, toDate, fieldValues, documentEventID, orderType, pageSize, applicationID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfListPageDataOfDocumentSearchResultwJCT_PyJfYbvldztq getDeactivatedDocuments(java.lang.String sessionID, org.datacontract.schemas._2004._07.DocumentManagementCommon_Pager.ListPagerParams listPageInfo) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDeactivatedDocuments(sessionID, listPageInfo);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType changeDocumentApplication(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer applicationID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.changeDocumentApplication(sessionID, documentGuid, applicationID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfBaseDocumentEventjJIl8QZi getAvailableDocumentEventsForApplication(java.lang.String sessionID, java.lang.Integer applicationID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getAvailableDocumentEventsForApplication(sessionID, applicationID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfBaseDocumentEventjJIl8QZi getAllDocumentEvents(java.lang.String sessionID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getAllDocumentEvents(sessionID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfListPageDataOfDocumentwJCT_PyJfYbvldztq getRelatedDocuments(java.lang.String sessionID, java.lang.String documentGuid, org.datacontract.schemas._2004._07.DocumentManagementCommon_Pager.ListPagerParams listPageInfo, java.lang.Integer orderType) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getRelatedDocuments(sessionID, documentGuid, listPageInfo, orderType);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfListPageDataOfDocumentSearchResultwJCT_PyJfYbvldztq getDocumentsInfoByMetadataValue(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID, org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] metadataValues, org.datacontract.schemas._2004._07.DocumentManagementCommon_Pager.ListPagerParams listPageInfo, java.util.Calendar fromTime, java.lang.String searchTerm, java.lang.Boolean shared) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentsInfoByMetadataValue(sessionID, applicationID, templateID, typeID, metadataValues, listPageInfo, fromTime, searchTerm, shared);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfListPageDataOfDocumentSearchResultwJCT_PyJfYbvldztq getClientDocumentsInfo(java.lang.String sessionID, java.lang.Integer clientID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID, org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] metadataValues, org.datacontract.schemas._2004._07.DocumentManagementCommon_Pager.ListPagerParams listPageInfo, java.util.Calendar fromTime, java.lang.String searchTerm, java.lang.Boolean shared) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getClientDocumentsInfo(sessionID, clientID, applicationID, templateID, typeID, metadataValues, listPageInfo, fromTime, searchTerm, shared);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfAdvisorInfo52SKXdDF getAdvisorClients(java.lang.String sessionID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getAdvisorClients(sessionID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentTemplatewJCT_PyJf createDocumentTemplate(java.lang.String sessionID, java.lang.String name) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.createDocumentTemplate(sessionID, name);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType removeDocumentTemplate(java.lang.String sessionID, java.lang.Integer templateID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.removeDocumentTemplate(sessionID, templateID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType unlinkTemplate(java.lang.String sessionID, java.lang.Integer templateID, java.lang.Integer applicationID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.unlinkTemplate(sessionID, templateID, applicationID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentTemplatewJCT_PyJf getAllDocumentTemplates(java.lang.String sessionID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getAllDocumentTemplates(sessionID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentTemplatewJCT_PyJf getDocumentTemplate(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentTemplate(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentTemplatewJCT_PyJf getDocumentTemplates(java.lang.String sessionID, java.lang.Integer applicationID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentTemplates(sessionID, applicationID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType setDocumentTemplate(java.lang.String sessionID, java.lang.String documentGuid, java.lang.Integer templateID, java.lang.Integer documentTypeID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.setDocumentTemplate(sessionID, documentGuid, templateID, documentTypeID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentTypewJCT_PyJf createDocumentType(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.String name) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.createDocumentType(sessionID, applicationID, templateID, name);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfanyType removeDocumentType(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.removeDocumentType(sessionID, applicationID, templateID, typeID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentTypewJCT_PyJf getDocumentType(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentType(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentTypewJCT_PyJf getDocumentTypes(java.lang.String sessionID, java.lang.Integer templateID, java.lang.Integer applicationID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentTypes(sessionID, templateID, applicationID);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentTypewJCT_PyJf getAllDocumentTypes(java.lang.String sessionID) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getAllDocumentTypes(sessionID);
  }
  
  public java.lang.String uploadFile(byte[] inputStream) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.uploadFile(inputStream);
  }
  
  public java.lang.String uploadFileJava(java.lang.String sessionID, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer descriptionID, org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] metadataValues, java.lang.String filename, java.lang.String successStatus1, byte[] inputStream) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.uploadFileJava(sessionID, applicationID, templateID, descriptionID, metadataValues, filename, successStatus1, inputStream);
  }
  
  public java.lang.String addNewExternalDocument(java.lang.String fileName, java.lang.String cdSession, java.lang.Integer applicationID, java.lang.Integer templateID, java.lang.Integer typeID, org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.DocumentMetadataValueBase[] metadata) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.addNewExternalDocument(fileName, cdSession, applicationID, templateID, typeID, metadata);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentDetailswJCT_PyJf getDocumentDetailed(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentDetailed(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentDetailswJCT_PyJf getDocumentDetailedWithoutPages(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentDetailedWithoutPages(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentwJCT_PyJf getDocument(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocument(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfDocumentDetailedMetadataInfowJCT_PyJf getDocumentDetailedMetadataInfo(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentDetailedMetadataInfo(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentMetadataEntrywJCT_PyJf getDocumentMetadata(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentMetadata(sessionID, documentGuid);
  }
  
  public org.datacontract.schemas._2004._07.CleverDomeDocumentManagement_Data.OperationResultOfArrayOfDocumentMetadataValueBasewJCT_PyJf getDocumentMetadataBase(java.lang.String sessionID, java.lang.String documentGuid) throws java.rmi.RemoteException{
    if (iWidgets == null)
      _initIWidgetsProxy();
    return iWidgets.getDocumentMetadataBase(sessionID, documentGuid);
  }
  
  
}